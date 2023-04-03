
public class Coche {
	//REFACTORIZADO
	public int velocidad;

	public void acelerar_franRiquelme(int aceleracion) {
		velocidad += aceleracion;
		
	}

	public void decelerar_franRiquelme(int deceleracion) {
		velocidad -= deceleracion;
		if(velocidad < 0) {
			velocidad = 0;
		}
		
	}
	
}
