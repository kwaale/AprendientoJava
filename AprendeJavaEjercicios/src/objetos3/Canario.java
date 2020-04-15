package objetos3;

public class Canario extends Ave{
	
	public Canario (){
		
	}
	public Canario(Sexo sex){
		super(sex);
	}
	public void camina(int numPatas){
		System.out.println("Camina con " + numPatas + " patas.");
	}
	public void canta(){
		System.out.println("canto jui,jui, jui");
	}
	public void come(String comida){
		System.out.println("Come " + comida);
	}
}
