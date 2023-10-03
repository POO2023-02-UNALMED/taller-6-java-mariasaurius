package vehiculos;

public class Vehiculo {
	
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private long precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos;
	
	
	
	Vehiculo (String placa, int puertas, int velocidadMaxima, String nombre, long precio, int peso, String traccion, Fabricante fabricante){
		this.setPlaca(placa);
		this.setPuertas(puertas);
		this.setVelocidadMaxima(velocidadMaxima);
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setTraccion(traccion);
		this.setFabricante(fabricante);
		Vehiculo.CantidadVehiculos++;
	}
	
	String vehiculosPorTipo (){
		//Llamar al atributo de clase para obtener la cantidad de automoviles
		int automoviles = Automovil.getCantidadAutomoviles();
		int camiones = Camion.getCantidadCamiones();
		int camionetas = Camioneta.getCantidadCamionetas();
		
		return "Automoviles:" + automoviles + "\n Camiones:" +camiones+ "\n Camionetas" + camionetas;
	
	}
	
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public long getPrecio() {
		return precio;
	}
	public void setPrecio(long precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}
	

}
