package org.servicios.practica;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
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
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
		public String home (Model model){
		
		return "home";
	}
	
	@RequestMapping(value = "/Servlet1", method = {RequestMethod.GET,RequestMethod.POST})
		public String servlet1 (HttpServletRequest request, Model model){
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String url = "";
		List<DTOUsuarios> lista = DAO.LeeUsuarios();
		
		
		if (DAO.buscarAdmin(user, pass) != null){
			url = "usuario"; //******
			} 
		else if(DAO.buscarUsuario(user, pass)!=null){
			DTOUsuarios dto = new DTOUsuarios();
			dto = DAO.buscarUsuario(user, pass);
			model.addAttribute("dto",dto);			
			url = "usuariodatos"; //****
		}
		else {
			url = "registro";//****		
		}
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
		
		DTOUsuarios usuarioDTO = new DTOUsuarios(user,pass,email,dni);
		
		String url = "";
		
		if (DAO.existUser(user, email, dni)){
			url = "existe";//****
		} else{
			DAO.insertaUsuario(usuarioDTO);
			url = "registrado";//****
		}
		return url;
	}
	
	
}
	

