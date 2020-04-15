package objetos3;

public class Gato extends Mamimefero{
	
	public Gato (Sexo sex, String color){
		super(sex);
	}
	public Gato(Sexo sex){
		super(sex);
	}
	public Gato(String color){
		super(Sexo.Hembra);
	}
	public Gato(){
		super(Sexo.Hembra);
	}
	public void ronronear(){
		System.out.println("ronronea");
	}
	public void comer(String comida){
		if(comida.equals("pescado")){
			System.out.println("muy rico");
		}else{
			System.out.println("lo siento, solo como pescado.");
		}
	}
	public void peleaCon(Gato contrincante){
		if(this.getSexo() == Sexo.Hembra){
			System.out.println("No me gusta pelear");
		}else{
			if(contrincante.getSexo()== Sexo.Hembra){
				System.out.println("No peleo con gatas");
			}else{
				System.out.println("Vas a ver");
			}
		}
	}
	public void limpiate(){
		System.out.println("Me estoy limpiando");
	}
	public void caza(){
		System.out.println("Estoy de caza.");
	}
	
}
