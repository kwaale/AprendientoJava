package club;

import java.util.Scanner;

public class Club {
	Socio s1, s2, s3;
	Scanner sc;
	
	public Club(){
		sc = new Scanner(System.in);
		s1 = new Socio(sc);
		s2 = new Socio(sc);
		s3 = new Socio(sc);
	}
	public void mayorAntiguedad(){
		if(s1.retAntiguedad() > s2.retAntiguedad() && s2.retAntiguedad() > s3.retAntiguedad()){
			s1.imprimir();
		}else{
			if(s2.retAntiguedad() > s3.retAntiguedad()){
				s2.imprimir();
			}else{
				s3.imprimir();
			}
		}
	}
	public static void main(String[] args) {
		Club c = new Club();
		c.mayorAntiguedad(); 
	}
}
