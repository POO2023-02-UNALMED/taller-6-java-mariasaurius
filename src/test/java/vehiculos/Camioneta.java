package vehiculos;

public class Camioneta extends Vehiculo{
	private boolean volco;
	private static int cantidadCamionetas;
	
	Camioneta (String placa,int puertas, String nombre, long precio, int peso,Fabricante fabricante, int CantidadVehiculos, boolean volco){
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante,CantidadVehiculos);
		this.setVolco(volco);
		Camioneta.cantidadCamionetas++;
		
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}

	public static void setCantidadCamionetas(int cantidadCamionetas) {
		Camioneta.cantidadCamionetas = cantidadCamionetas;
	}


}
