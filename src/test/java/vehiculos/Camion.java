package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;
	private static int cantidadCamiones;
	
	public Camion (String placa, String nombre, long precio, int peso,Fabricante fabricante,int ejes){
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
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
