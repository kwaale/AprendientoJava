package objetos;

public class JuegoDados {

	Dado d1 = new Dado();
	Dado d2 = new Dado();
	Dado d3 = new Dado();
	
	public void jugar() {
		d1.tirar();
		d1.imprimir();
		d2.tirar();
		d2.imprimir();
		d3.tirar();
		d3.imprimir();
				
		if(d1.retornaVal() == d2.retornaVal() && d1.retornaVal() == d3.retornaVal()){
			System.out.println("**********Gano*********");
		}else {
			System.out.println("Perdio");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JuegoDados dd1 = new JuegoDados();
		JuegoDados dd2 = new JuegoDados();
		JuegoDados qq1 = new JuegoDados();
		
		dd1.jugar();
		dd2.jugar();
		qq1.jugar();
	}

}
