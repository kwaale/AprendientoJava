package polizaSeguro;

public class PolizaAuto {
	private int numeroCuenta;
	private String marcaYModelo;
	private String estado;

	public PolizaAuto(int numeroCuenta, String marcaYModelo, String estado) {
		this.numeroCuenta = numeroCuenta;
		this.marcaYModelo = marcaYModelo;
		setEstado(estado);
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public String getMarcaYModelo() {
		return marcaYModelo;
	}

	public String getEstado() {
		return estado;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setMarcaYModelo(String marcaYModelo) {
		this.marcaYModelo = marcaYModelo;
	}

	public void setEstado(String estado) {
		if (estado == "CT" || estado == "MA" || estado == "ME" || estado == "NH" || estado == "NJ" || estado == "NY"
				|| estado == "PA" || estado == "VT") {
			this.estado = estado;
		} else {
			this.estado = "*ESTADO NO VALIDO*";
		}
	}

	public boolean esEstadoSinCulpa() {
		boolean estadoSinCulpa;
		switch (this.estado) {
		case "MA":
		case "NJ":
		case "NY":
		case "PA":
		case "CT":
		case "ME":
		case "NH":
		case "VT":

			estadoSinCulpa = true;
			break;
		default:
			estadoSinCulpa = false;
			break;
		}
		return estadoSinCulpa;
	}

}
