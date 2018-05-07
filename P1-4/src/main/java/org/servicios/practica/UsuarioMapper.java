package org.servicios.practica;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


	public class UsuarioMapper implements RowMapper <DTOUsuarios>{
		public DTOUsuarios mapRow(ResultSet rs, int rowNum) throws SQLException{
		DTOUsuarios usuario = new DTOUsuarios();
		usuario.setUser(rs.getString("user"));
		usuario.setPass(rs.getString("pass"));
		usuario.setEmail(rs.getString("email"));
		usuario.setDni(rs.getString("dni"));
		return usuario;
		}
		}
	

