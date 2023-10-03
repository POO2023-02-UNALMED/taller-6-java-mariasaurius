package Vehiculo;

public class Camion extends Vehiculo{
	private int ejes;
	private static int cantidadCamiones;
	
	Camion (String placa, String nombre, long precio, int peso,Fabricante fabricante, int CantidadVehiculos, int ejes){
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante,CantidadVehiculos);
		this.setEjes(ejes);
		Camion.cantidadCamiones++;
		
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public static int getCantidadCamiones() {
		return cantidadCamiones;
	}

	public static void setCantidadCamiones(int cantidadCamiones) {
		Camion.cantidadCamiones = cantidadCamiones;
	}
}
