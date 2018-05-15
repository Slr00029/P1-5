package org.servicios.practica;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@Autowired
	private DAOUsuariosInterfaz DAO;
	@Autowired
	private DAOArticulos DAO2;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
		public String home (Model model, HttpServletRequest request){
		

	 
	/*	Cookie[] cookies = request.getCookies();
		String cUser = "user";
		String Nombre = "";
		
		if(cookies == null){
	*/	
	/*	HttpSession sesion = request.getSession(true);	
		DTOUsuarios user = (DTOUsuarios) sesion.getAttribute("user");*/
		
		
		
			return "home";
	/*	}
		else {
			 for(Cookie cookie: cookies){ gvih
				 if(cUser.equals(cookie.getName())){
					 Nombre = cookie.getValue();
				 }
			 }
			 if(Nombre.equals("Admin")){
				 // Listar usuarios
				 return "usuario";
			 }
			 else {
				// Como ya se ha registrado, mostramos la vista articulo 
				 return "articulos"; // Hacer vista articulo *****
			 }
		}
		
		*/
	}
	
	@RequestMapping(value = "/registro", method = RequestMethod.GET)
	public String registro (Model model, HttpServletRequest request){
	
		return "registro";

}
	
	
	@RequestMapping(value = "/Servlet1", method = {RequestMethod.GET,RequestMethod.POST})
		public String servlet1 (HttpServletRequest request, Model model, HttpServletResponse response){
		
		HttpSession sesion = request.getSession(true);	
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");

		 DTOUsuarios usuario = (DTOUsuarios) new DTOUsuarios();
		
		
		
		
		String url = "";
		List<DTOUsuarios> lista = DAO.LeeUsuarios();
		sesion.setAttribute("user", user);
		sesion.setAttribute("pass", pass);
		// Cookie CUser = null;
		
		if (DAO.buscarAdmin(user, pass) != null){
			url = "usuario"; //******
		/*	CUser = new Cookie("user", user);
			CUser.setPath("/");
			CUser.setMaxAge(60*60*24*365*2);
			response.addCookie(CUser);*/
			model.addAttribute("lista", lista);
			} 
		else if(DAO.buscarUsuario(user, pass)!=null){
		/*	CUser = new Cookie("user", user);
			CUser.setPath("/");
			CUser.setMaxAge(60*60*24*365*2);
			response.addCookie(CUser); */
			DTOUsuarios dto = new DTOUsuarios();
			dto = DAO.buscarUsuario(user, pass);
			model.addAttribute("dto",dto);	
			List<DTOArticulos> lista2 = DAO2.LeeArticulos();
			
			model.addAttribute("lista2", lista2);
			url = "articulos"; //**** lista articulos vista
			
		}
		else {
			url = "registro";//****		
		}
	/*	HttpSession sesion = request.getSession();
		sesion.setAttribute("usuario", usuario); */
		model.addAttribute("lista",lista);
		return url;
	}
	
	@RequestMapping(value = "/Servlet2", method = {RequestMethod.GET,RequestMethod.POST})
	public String servlet2 (HttpServletRequest request, Model model) {
		String user = request.getParameter("user");
		model.addAttribute("User", user);
		
		String pass = request.getParameter("pass");
		model.addAttribute("Pass", pass);
		
		String email = request.getParameter("email");
		model.addAttribute("Email", email);	
		
		String dni = request.getParameter("dni");
		model.addAttribute("DNI", dni);
		
		
		
		String url = "";
		
		if (DAO.existUser(user, email, dni) == true){
			url = "usuarioYaRegistrado";
			
		} else{
			DTOUsuarios usuarioDTO = new DTOUsuarios(user,pass,email,dni);
			DAO.insertaUsuario(usuarioDTO);
			

			List<DTOArticulos> lista2 = DAO2.LeeArticulos();
			model.addAttribute("lista2", lista2);
			url = "articulos";
		}
		return url;
	}
	
	
}
	

