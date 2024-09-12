package demo.actividad;

public class Barco {

	private String color;
	private int cantidadPasajeros;
	private Double velocidadNavegacion;

	public void modificarColor(String parametroColor) {
		this.color = parametroColor;
	}

	public String obtenerColor() {
		return this.color;
	}

	public void modificarcantidadPasajeros(int parametrocantidadPasajeros) {
		this.cantidadPasajeros = parametrocantidadPasajeros;
	}

	public int obtenerCantidadPasajeros() {
		return this.cantidadPasajeros;
	}

	public void modificarvelocidadNavegacion(double velocidadNavegacion) {
		this.velocidadNavegacion = velocidadNavegacion;
	}

	public Double obtenervelocidadNavegacion() {
		return this.velocidadNavegacion;
	}
}

