package objetos3;

public class Mamimefero extends Animal {
	
	public Mamimefero(){
		super(Sexo.Hembra);
	}
	public Mamimefero(Sexo sex){
		super(sex);
	}
	public void amamanta(){
		if(this.getSexo()== Sexo.Macho){
			System.out.println("Los machos no amamantan.");
		}else{
			System.out.println("Esta amamantando.");
		}
	}
	public void cuidarCrias(){
		System.out.println("Esta cuidando las crias.");
	}
	public void anda(){
		System.out.println("Esta andando.");
	}

}
