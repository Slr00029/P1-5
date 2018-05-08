package org.servicios.practica;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ArticulosMapper implements RowMapper <DTOArticulos> {

	public DTOArticulos mapRow(ResultSet rs, int rowNum) throws SQLException{
		DTOArticulos articulo = new DTOArticulos();
		articulo.setNombre(rs.getString("nombre"));
		articulo.setId(rs.getInt("id"));
		articulo.setPrecio(rs.getFloat("precio"));
		return articulo;
		}
	
}
