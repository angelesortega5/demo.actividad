package demo.actividad;

public class Factura {

	private String nombre;
	private int cuotaDeIva;
	private Double precio;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setCuotaDeIva(int cuotaDeIva) {
		this.cuotaDeIva = cuotaDeIva;
	}

	public int getCuotaDeIva() {
		return this.cuotaDeIva;
	}

	public void setprecio(Double precio) {
		this.precio = precio;
	}

	public Double getprecio() {
		return this.precio;
	}

}
