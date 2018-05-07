package org.servicios.practica;


import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class DAOUsuarios implements DAOUsuariosInterfaz{
	

public JdbcTemplate jdbcTemplate;



@Autowired
public void setDataSource(DataSource dataSource) {
this.jdbcTemplate = new JdbcTemplate(dataSource);
}



@Override
public List<DTOUsuarios> LeeUsuarios() {
	String sql = "select * from usuarios";
	UsuarioMapper mapper = new UsuarioMapper();
	List<DTOUsuarios> usuarios = this.jdbcTemplate.query(sql, mapper);
	return usuarios;
}



@Override
public void insertaUsuario(DTOUsuarios user) {
	String sql = "insert into usuarios values(?,?,?,?)";
	Object[ ] parametros = {user.getUser(),user.getPass(), user.getEmail(), user.getDni()};
	this.jdbcTemplate.update(sql, parametros);
}



@Override
public boolean existUser(String user, String email, String dni) {
	String sql = "select * from usuarios where User = ? OR Email = ? OR DNI = ?";
	Object[] parametros = {user, email, dni};
	UsuarioMapper mapper = new UsuarioMapper();
	List<DTOUsuarios> usuarios = this.jdbcTemplate.query(sql,  parametros, mapper);
	if (usuarios.isEmpty())
		{
		return false;
		}
	else return true; 
}



@Override
public DTOUsuarios buscarUsuario(String user, String pass) {
	String sql = "select * from usuarios where User = ? AND Pass = ?";
	Object[] parametros = {user, pass};
	UsuarioMapper mapper = new UsuarioMapper();
	List<DTOUsuarios> usuarios = this.jdbcTemplate.query(sql,  parametros, mapper);
	if (usuarios.isEmpty()) return null; 
	else return usuarios.get(0);
}



@Override
public DTOUsuarios buscarAdmin(String user, String pass) {
		if(user.equals("Admin") && pass.equals("1234")) {
		String sql = "select * from usuarios where User = ? AND Pass = ?";
		Object[ ] parametros = {user, pass};
		UsuarioMapper mapper = new UsuarioMapper();
		List<DTOUsuarios> usuarios = this.jdbcTemplate.query(sql, parametros, mapper);
		if (usuarios.isEmpty()) return null;
		else return usuarios.get(0);
		}else {
			return null;
		}
}



@Override
public DTOUsuarios buscarUsuario(String dni) {
	String sql = "select * from usuarios where DNI = ?";
	Object[ ] parametros = {dni};
	UsuarioMapper mapper = new UsuarioMapper();
	List<DTOUsuarios> usuarios = this.jdbcTemplate.query(sql, parametros, mapper);
	if (usuarios.isEmpty()) return null;
	else return usuarios.get(0);
}



	
}
