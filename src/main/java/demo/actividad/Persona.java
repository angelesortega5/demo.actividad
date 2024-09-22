package demo.actividad;

public class Persona {

	String nombre;
	String primerApellido;
	int añosPracticandoFutbol;
	Double añosEnEspaña;

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getnombre() {
		return this.nombre;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setAñosPracticandoFutbol(int añosPracticandoFutbol) {
		this.setAñosPracticandoFutbol(añosPracticandoFutbol);
	}

	public int getAnosPracticandoFutbol() {
		return this.añosPracticandoFutbol;
	}

	public void setañosEnEspaña(Double añosEnEspaña) {
		this.añosEnEspaña = añosEnEspaña;
	}

	public Double getAñosEnEspaña() {
		return this.añosEnEspaña;
	}

}
