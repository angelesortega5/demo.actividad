package demo.actividad;

public class Bicicleta {

	private String tipo;
	private int cantidadLLantas;
	private Double medidaRin;

	public String obtenertipo() {
		return this.tipo;
	}

	public void modificarTipo(String tipo) {
		this.tipo = tipo;
	}

	public void modificarcantidadLLantas(int cantidadLLantas) {
		this.cantidadLLantas = cantidadLLantas;

	}

	public int obtenercantidadLLantas() {
		return this.cantidadLLantas;
	}

	public void modificarmedidaRin(Double medidaRin) {
		this.medidaRin = medidaRin;

	}

	public Double obtenermedidaRin() {
		return this.medidaRin;
	}

}
