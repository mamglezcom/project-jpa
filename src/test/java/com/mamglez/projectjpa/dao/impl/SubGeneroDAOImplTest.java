/**
 * 
 */
package com.mamglez.projectjpa.dao.impl;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.mamglez.projectjpa.dao.SubGeneroDAO;
import com.mamglez.projectjpa.entity.Genero;
import com.mamglez.projectjpa.entity.SubGenero;
/**
 * @author skype
 *
 */
class SubGeneroDAOImplTest {
	
	SubGeneroDAO subGeneroDAO = new SubGeneroDAOImpl();

	/**
	 * Test method for {@link com.mamglez.projectjpa.dao.impl.SubGeneroDAOImpl#guardar(com.mamglez.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testGuardar() {
		SubGenero subGenero = new SubGenero();
		subGenero.setDescripcion("hardcore");
		subGenero.setFechaCreacion(LocalDateTime.now());
		subGenero.setEstatus(true);
		Genero genero = new Genero();
		genero.setDescripcion("metal");
		genero.setFechaCreacion(LocalDateTime.now());
		genero.setEstatus(true);
		
		subGenero.setGenero(genero);
		this.subGeneroDAO.guardar(subGenero);
	}

	/**
	 * Test method for {@link com.mamglez.projectjpa.dao.impl.SubGeneroDAOImpl#actualizar(com.mamglez.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testActualizar() {
		SubGenero subGenero = this.subGeneroDAO.consultarById(8L);
		subGenero.setDescripcion("Trashmetal");
		subGenero.getGenero().setDescripcion("metal trash");
		
		this.subGeneroDAO.actualizar(subGenero);
	}

	/**
	 * Test method for {@link com.mamglez.projectjpa.dao.impl.SubGeneroDAOImpl#eliminar(java.lang.Long)}.
	 */
	@Test
	void testEliminar() {
		this.subGeneroDAO.eliminar(8L);
	}

	/**
	 * Test method for {@link com.mamglez.projectjpa.dao.impl.SubGeneroDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<SubGenero> subGeneros =  this.subGeneroDAO.consultar();
		assertTrue(subGeneros.size() > 0);
		for(SubGenero subGenero : subGeneros) {
			System.out.println("SubGenero: " + subGenero.getDescripcion());
			System.out.println("Genero " + subGenero.getGenero().getDescripcion());
		}
				
	}

	/**
	 * Test method for {@link com.mamglez.projectjpa.dao.impl.SubGeneroDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		fail("Not yet implemented");
	}

}
