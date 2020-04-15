package objetos3;

public abstract class Animal {
	//128 Libro
	//Definicion CLase Abstracta
	//Una clase abstracta es aquella que no va a tener instancias de forma directa,
	//aunque sí habrá instancias de las subclases (siempre que esas subclases no
	//sean también abstractas). Por ejemplo, si se define la clase Animal como abstracta,
	//no se podrán crear objetos de la clase Animal, es decir, no se podrá hacer Animal mascota
	//= new Animal(),pero sí se podrán crear instancias de la clase Gato, Ave o Pinguino
	
	private Sexo sexo;
	
	public Animal(){
		this.sexo = Sexo.Macho;
	}
	public Animal(Sexo x){
		this.sexo = x;
	}
	public Sexo getSexo(){
		return this.sexo;
	}
	public String toString(){
		return "Sexo: " + this.sexo + "/n";
	}

	
	
		

}
