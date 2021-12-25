/**
 * 
 */
package com.mamglez.projectjpa.dao;

import java.util.List;

import com.mamglez.projectjpa.entity.SubGenero;

/**
 * @author skype
 * interface DAO CRUD tabla subGenero
 */
public interface SubGeneroDAO {
	
	void guardar(SubGenero subGenero);
	
	void actualizar(SubGenero subGenero);
	
	void eliminar(Long id);
	
	List<SubGenero> consultar();
	
	SubGenero consultarById(Long id);

}
