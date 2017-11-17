import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestBasicos {
	
	private Calculadora calc;

	@Before
	public void setUp() throws Exception {
		calc = new Calculadora();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void Una_nueva_calculadora_debe_iniciar_en_cero() {
		//Calculadora calc = new Calculadora();
		Assert.assertEquals(0, calc.Valor());
			
	}
	
	@Test
	public void Sumar_2_mas_3_debe_dar_5() {
		//Calculadora calc = new Calculadora();
		
		calc.Sumar(2,3);
		Assert.assertEquals(5, calc.Valor());
			
	}
	
	@Test
	public void Sumar_4_mas_3_debe_dar_7() {
		//Calculadora calc = new Calculadora();
		
		calc.Sumar(4,3);
		Assert.assertEquals(7, calc.Valor());
			
	}
	
	@Test
	public void Restar_4_menos_3_debe_dar_1() {
		//Calculadora calc = new Calculadora();
		
		calc.Restar(4,3);
		Assert.assertEquals(1, calc.Valor());
			
	}

}
