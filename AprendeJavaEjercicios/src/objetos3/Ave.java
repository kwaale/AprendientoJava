package objetos3;

public class Ave extends Animal {

	public Ave() {
		super(Sexo.Hembra);
	}

	public Ave(Sexo sex) {
		super(sex);
	}

	public void ponHuevo() {
		if (this.getSexo() == Sexo.Macho) {
			System.out.println("Los machos no ponen huevos.");
		} else {
			System.out.println("puesto el huevo");
		}
	}

	public void limpiate() {
		System.out.println("Me estoy lavando en la fuente.");
	}

	public void vuela() {
		System.out.println("Estoy volando");
	}

}
