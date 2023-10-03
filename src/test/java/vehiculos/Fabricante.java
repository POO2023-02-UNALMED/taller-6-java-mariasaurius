package vehiculos;

import java.util.HashMap;
import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	static HashMap<String, Integer> cantidadVehiculosxFabricante;
	static ArrayList<Vehiculo> listaVehiculosCreados;
	
	public Fabricante (String nombre, Pais pais){
		this.setNombre(nombre);
		this.setPais(pais);
		Fabricante.cantidadVehiculosxFabricante = new HashMap<String, Integer>();
		Fabricante.listaVehiculosCreados = new ArrayList<Vehiculo>();
	}
	
	public void agregarVehiculos(Vehiculo vehiculos) {
		listaVehiculosCreados.add(vehiculos);
	}
	
	void agregarCantidadVehiculos (){
		for(Vehiculo vehiculo : listaVehiculosCreados) {
			String nombreFabricante = vehiculo.getFabricante().getNombre();
			cantidadVehiculosxFabricante.put(nombreFabricante, cantidadVehiculosxFabricante.getOrDefault(nombreFabricante, 0) + 1);
		}
	}
	
	public static Fabricante fabricaMayorVentas () {
		 String claveMaxima = "valorcualquiera";
	     int valorMaximo = Integer.MIN_VALUE;
		 for (String clave : cantidadVehiculosxFabricante.keySet()) {
	            int valor = cantidadVehiculosxFabricante.get(clave);
	            if (valor > valorMaximo) {
	                valorMaximo = valor;
	                claveMaxima = clave;
	            }
	        }
		 
		  Pais paisMayorVentas = null;
		  for (Vehiculo vehiculo : listaVehiculosCreados) {
		       if (vehiculo.getFabricante().getNombre().equals(claveMaxima)) {
		           paisMayorVentas = vehiculo.getFabricante().getPais();
		           break; 
		        }
		    }
		  
		  return new Fabricante(claveMaxima, paisMayorVentas);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
