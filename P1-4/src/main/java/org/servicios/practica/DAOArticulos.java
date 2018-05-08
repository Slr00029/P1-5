package org.servicios.practica;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DAOArticulos implements DAOArticulosInterfaz {

	public JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource2) {
	this.jdbcTemplate = new JdbcTemplate(dataSource2);
	}
	
	@Override
	public List<DTOArticulos> LeeArticulos() {
		String sql = "select * from articulos";
		ArticulosMapper mapper = new ArticulosMapper();
		List<DTOArticulos> articulos = this.jdbcTemplate.query(sql, mapper);
		return articulos;
	}

	@Override
	public DTOArticulos buscarArticulo(int id) {
		String sql = "select * from articulos where Id = ?";
		Object[] parametros = {id};
		ArticulosMapper mapper = new ArticulosMapper();
		List<DTOArticulos> articulos = this.jdbcTemplate.query(sql, parametros, mapper);
		if (articulos.isEmpty()) return null;
		else return articulos.get(0);
		}
		
	}


