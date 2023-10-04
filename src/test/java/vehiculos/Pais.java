package vehiculos;

import java.util.HashMap;

public class Pais {
	private String nombre;
	private static HashMap<String, Pais> paises = new HashMap<>();
    private static HashMap<String, Integer> cantidadVehiculosxPais = new HashMap<>();

	public Pais (String nombre) {
		this.setNombre(nombre);
		paises.put(nombre, this);
		
	}

    public static void incrementarCantidadVehiculos(String nombrePais) {
        cantidadVehiculosxPais.put(nombrePais, cantidadVehiculosxPais.getOrDefault(nombrePais, 0) + 1);
    }

    public static Pais paisMasVendedor() {
        String nombrePaisMasVendedor = null;
        int maxVentas = Integer.MIN_VALUE;

        for (String nombrePais : cantidadVehiculosxPais.keySet()) {
            int ventas = cantidadVehiculosxPais.get(nombrePais);

            if (ventas > maxVentas) {
                maxVentas = ventas;
                nombrePaisMasVendedor = nombrePais;
            }
        }

        Pais paisMasVendedor = paises.get(nombrePaisMasVendedor);

        return paisMasVendedor;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
