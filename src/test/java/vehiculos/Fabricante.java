package vehiculos;

import java.util.HashMap;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static HashMap<String, Fabricante> fabricantes = new HashMap<>();
    private static HashMap<String, Integer> cantidadVehiculosxFabricante = new HashMap<>();


	
	public Fabricante (String nombre, Pais pais){
		this.setNombre(nombre);
		this.setPais(pais);
		fabricantes.put(nombre, this);
	}
	
	public static void incrementarCantidadVehiculos(String nombreFabricante) {
        cantidadVehiculosxFabricante.put(nombreFabricante, cantidadVehiculosxFabricante.getOrDefault(nombreFabricante, 0) + 1);
    }

	
    public static Fabricante fabricaMayorVentas() {
        String nombreFabricaMasVendedor = null;
        int maxVentas = Integer.MIN_VALUE;

        for (String nombreFabrica : cantidadVehiculosxFabricante.keySet()) {
            int ventas = cantidadVehiculosxFabricante.get(nombreFabrica);

            if (ventas > maxVentas) {
                maxVentas = ventas;
                nombreFabricaMasVendedor = nombreFabrica;
            }
        }

        Fabricante fabricaMayorVentas = fabricantes.get(nombreFabricaMasVendedor);

        return fabricaMayorVentas;
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
