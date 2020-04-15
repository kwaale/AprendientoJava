package objetos;

import java.util.Scanner;

public class Club {
	private Socio s1, s2, s3;
	private Scanner entrada;

	public Club() {
		entrada = new Scanner(System.in);
		s1 = new Socio(entrada);
		s2 = new Socio(entrada);
		s3 = new Socio(entrada);
	}

	public void mayorAntiguedad() {
		if (s1.getAntiguedad() > s2.getAntiguedad() && s2.getAntiguedad() > s3.getAntiguedad()) {
			s1.imprimir();
		} else {
			if (s2.getAntiguedad() > s1.getAntiguedad()) {
				s2.imprimir();
			} else {
				s3.imprimir();

			}
		}
	}
	public static void main(String[] args) {
		Club c = new Club();
		c.s1.imprimir();
		c.s2.imprimir();
		c.s3.imprimir();
		c.mayorAntiguedad();
	} 
}
