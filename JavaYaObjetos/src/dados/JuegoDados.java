package dados;

public class JuegoDados {
	Dado dado1, dado2, dado3;
	
	public JuegoDados(){
		dado1 = new Dado();
		dado2 = new Dado();
		dado3 = new Dado();
	}
	public void juegar(){
		dado1.tirar();
		dado1.imprimmirValor();
		dado2.tirar();
		dado2.imprimmirValor();
		dado3.tirar();
		dado3.imprimmirValor();
	if(dado1.retornoValor() == dado2.retornoValor() && dado2.retornoValor()==dado3.retornoValor()){
		System.out.println("**************Gano**************");
	}else{
		System.out.println("--------------Perdio--------------");
	}
	}
	public static void main(String[] args) {
		JuegoDados jd = new JuegoDados();
		jd.juegar();
	}
}
