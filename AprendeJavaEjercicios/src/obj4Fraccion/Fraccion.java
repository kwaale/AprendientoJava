package obj4Fraccion;

public class Fraccion {
	//Crea la clase Fracción. Los atributos serán numerador y denominador.
	//Y algunos de los métodos puedenser invierte, simplifica, multiplica, divide,etc.
	
	private int numerador;
	private int denominador;
	private int signo;
	
	public Fraccion(int n,int d){
		if(n == 0){
			System.out.println("El numerador no puede ser igual a cero (0)");
		}else{
			if(n * d < 0){
				this.signo = -1;
			}else{
				this.signo = 1;
			}
			this.numerador = Math.abs(n);
			this.denominador = Math.abs(d);
		}
	}
	public int getNumerador(){
		return this.numerador;
	}
	public int getDenominador(){
		return this.denominador;
	}
	public String toString(){
		if(signo == -1){
			return "-" + this.numerador + "/" + this.denominador;
		}else{
			return this.numerador + "/" + this.denominador;
		}
	}
	public Fraccion invierte(){
		return new Fraccion(this.signo * this.denominador,this.numerador);
	}
	
	public Fraccion multiplica(Fraccion f){
		return new Fraccion(this.signo * this.numerador * f.getNumerador(),this.denominador * f.getDenominador());
	}
	public Fraccion divide(int n){
		return new Fraccion(this.signo * this.numerador, this.denominador * n);
	}
	public Fraccion divide(Fraccion f){
		return new Fraccion(this.signo + this.numerador * f.getDenominador(),this.denominador * f.getDenominador());
	}
	public Fraccion simplifica(){
		int s = this.signo;
		int n = this.numerador;
		int d = this.denominador;
		
		for(int i = 2; i < Math.min(n, d); i++){
			while((n % i) == 0 && (d % i) == 0){
				n /= i;
				d /= i;
			}
		}
		return new Fraccion(s * n,d);
	}
	
	
}
