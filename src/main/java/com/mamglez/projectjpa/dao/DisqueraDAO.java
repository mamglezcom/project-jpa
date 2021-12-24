/**
 * 
 */
package com.mamglez.projectjpa.dao;

import java.util.List;

import com.mamglez.projectjpa.entity.Disquera;

/**
 * @author skype
 * Interfaz para DAO 
 */
public interface DisqueraDAO {
	
	void guardar(Disquera disquera);
	
	void actualizar(Disquera disquera);
	
	void eliminar(Long id);
	
	List<Disquera> consultar();
	
	Disquera consultarById(Long id);

}
