/**
 * 
 */
package com.mamglez.projectjpa.dao.impl;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.mamglez.projectjpa.dao.DisqueraDAO;
import com.mamglez.projectjpa.entity.Disquera;

/**
 * @author skype
 *
 */
class DisqueraDAOImplTest {
	
	private DisqueraDAO disqueraDAO = new DisqueraDAOImpl();

	/**
	 * Test method for {@link com.mamglez.projectjpa.dao.impl.DisqueraDAOImpl#guardar(com.mamglez.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testGuardar() {
		Disquera disquera = new Disquera();
		disquera.setDescripcion("megaforce");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setEstatus(true);
		
		this.disqueraDAO.guardar(disquera);
	}

	/**
	 * Test method for {@link com.mamglez.projectjpa.dao.impl.DisqueraDAOImpl#actualizar(com.mamglez.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testActualizar() {
		Disquera disquera = this.disqueraDAO.consultarById(13L);
		disquera.setDescripcion("a tope");
		this.disqueraDAO.actualizar(disquera);
	}

	/**
	 * Test method for {@link com.mamglez.projectjpa.dao.impl.DisqueraDAOImpl#eliminar(com.mamglez.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testEliminar() {
		Long id = 10L;
		this.disqueraDAO.eliminar(id);
	}

	/**
	 * Test method for {@link com.mamglez.projectjpa.dao.impl.DisqueraDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<Disquera> disqueras = this.disqueraDAO.consultar();
		assertTrue(disqueras.size() > 0);
		disqueras.forEach(d -> {
			System.out.println("disquera " + d.getDescripcion());
		});
	}

	/**
	 * Test method for {@link com.mamglez.projectjpa.dao.impl.DisqueraDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		Disquera disquera = this.disqueraDAO.consultarById(19L);
		System.out.println("disquera: " + disquera.getDescripcion());
	}

}
