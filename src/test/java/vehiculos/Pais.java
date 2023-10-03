package vehiculos;

import java.util.HashMap;
import java.util.ArrayList;

public class Pais {
	private String nombre;
	static HashMap<String, Integer> cantidadVehiculosxPais;
	static ArrayList<Vehiculo> listaVehiculosCreados;
	
	public Pais (String nombre) {
		this.setNombre(nombre);
		Pais.cantidadVehiculosxPais = new HashMap<String, Integer>();
	}

	public void agregarVehiculos(Vehiculo vehiculos) {
		listaVehiculosCreados.add(vehiculos);
	}
	
	void agregarCantidadVehiculos (){
		for(Vehiculo vehiculo : listaVehiculosCreados) {
			String paisFabricante = vehiculo.getFabricante().getPais().getNombre();
			cantidadVehiculosxPais.put(paisFabricante, cantidadVehiculosxPais.getOrDefault(paisFabricante, 0) + 1);
		}
	}
	
	public String claveMaxima = null;
    int valorMaximo = Integer.MIN_VALUE;
    
	public String paisMasVendedor () {
		 for (String clave : cantidadVehiculosxPais.keySet()) {
	            int valor = cantidadVehiculosxPais.get(clave);
	            if (valor > valorMaximo) {
	                valorMaximo = valor;
	                claveMaxima = clave;
	            }
	        }
		 return claveMaxima;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
