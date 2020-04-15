package objetos3;

public class Lagarto extends Animal{
	
	public Lagarto(){
		
	}
	public Lagarto(Sexo sex){
		super(sex);
	}
	public void tomaSol(){
		System.out.println("Toma el sol");
	}
	public void comeCarne(){
		System.out.println("Come carne.");
	}
	public void escondete(){
		System.out.println("Se esconde.");
	}
}
