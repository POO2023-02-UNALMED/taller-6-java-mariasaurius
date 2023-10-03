package Vehiculo;

public class Automovil extends Vehiculo{
	private int puestos;
	private static int cantidadAutomoviles;
	
	
	Automovil (String placa,String nombre, long precio, int peso,Fabricante fabricante, int CantidadVehiculos, int puestos){
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante,CantidadVehiculos);
		this.setPuestos(puestos);
		Automovil.cantidadAutomoviles++;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static int getCantidadAutomoviles() {
		return cantidadAutomoviles;
	}

	public static void setCantidadAutomoviles(int cantidadAutomoviles) {
		Automovil.cantidadAutomoviles = cantidadAutomoviles;
	}

}
