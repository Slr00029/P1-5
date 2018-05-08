package org.servicios.practica;

import java.util.List;

public interface DAOArticulosInterfaz {

	public List<DTOArticulos> LeeArticulos();

	public DTOArticulos buscarArticulo(int id);
}
