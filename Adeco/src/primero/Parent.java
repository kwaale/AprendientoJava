package primero;

public class Parent {

//	3. Dada la clase "Parent" a continuaci�n, cree una clase "Child"
	// que ampl�e Parent, anule el m�todo "calcularMultiplicacao" y sobrecargue el
	// m�todo "concatenarFrases".

	public String concatenarFrases(String f1, String f2) {
		return f1 + f2;
	}

	public int calcularMultiplicacao(int fator1, int fator2) {
		return fator1 * fator2;
	}

}
