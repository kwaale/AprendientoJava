package objetos3;

public class Pinguino extends Ave{
	
	public Pinguino(){
		
	}
	public Pinguino(Sexo sex){
		super(sex);		
	}
	public void vuela(){
		System.out.println("No puedo volar.");
	}
	public void programa(){
		System.out.println("Programo en java.");
	}
	public void come(){
		System.out.println("Voy a pescar");
	}
}
