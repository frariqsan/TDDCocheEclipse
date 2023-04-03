import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class Tests {
	// REFACTORIZADO
	@Test
	public void test_al_crear_un_coche_su_velocidad_es_cero() {
		Coche nuevoCoche = new Coche();
		Assert.assertEquals(0, nuevoCoche.velocidad);
	}
	
	@Test
	public void test_al_acelerar_un_coche_su_velocidad_aumenta() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerar_franRiquelme(30);
		Assert.assertEquals(30, nuevoCoche.velocidad);
	}
	@Test
	public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad = 50;
		nuevoCoche.decelerar_franRiquelme(80);
		Assert.assertEquals(0, nuevoCoche.velocidad);
	}

}
