package factura;

public class Factura {

	private String numPieza;
	private String descripcion;
	private int cantidad;
	private double precio;

	public Factura(String numPieza, String descripcion, int cantidad, double precio) {
		this.numPieza = numPieza;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public void setNumPieza(String numPieza) {
		this.numPieza = numPieza;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getNumPieza() {
		return numPieza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecio() {
		if (precio > 0) {
			precio = 0.0;
		}
		return precio;
	}

	public double getMontoFactura() {
		double montoFactura = this.cantidad * this.precio;
		if (montoFactura < 0) {
			montoFactura = 0;
		}
		return montoFactura;
	}

}
