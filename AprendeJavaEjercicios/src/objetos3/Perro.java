package objetos3;

public class Perro extends Animal{

	public Perro(Sexo sex){
		super(sex);
	}
	public Perro(){
		super(Sexo.Hembra);
	}
	public void ladra(){
		System.out.println("Estoy ladrando.");
	}
	public void daLaPata(){
		System.out.println("Doy la pata");
	}
}
