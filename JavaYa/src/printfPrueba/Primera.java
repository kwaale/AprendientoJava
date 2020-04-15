package printfPrueba;

import java.util.Scanner;

public class Primera {

public static void main(String[] args) {
	

    char opcion;
    int numero, contador, resultado;
    Scanner teclado = new Scanner(System.in);

    do
    {
        System.out.printf("\n>>> MENÚ DE OPCIONES <<<");
        System.out.printf("\n1. Números del 1 al 10.");
        System.out.printf("\n2. Tabla de multiplicar del 8.");
        System.out.printf("\n3. Primeras diez potencias de 2.");
        System.out.printf("\n4. Salir.");

        do
        {
            System.out.printf("\nIntroduzca opción (1-4): ");
            opcion = teclado.next().charAt(0);
        }
        while(opcion < '1' || opcion > '4');

        System.out.printf("\n");

        switch(opcion)
        {
            case '1': for(numero = 1; numero <= 10; numero++)
                          System.out.printf("%d ", numero);
                      System.out.printf("\n");
                      break;
            case '2': for(contador = 1; contador <= 10; contador++)
                      {
                          resultado = contador * 8;
                          System.out.printf("8 * %d = %d\n", contador, resultado);
                      }
                      break;
            case '3': for(contador = 1; contador <= 10; contador++)
                          System.out.printf("%d ", (int) Math.pow(2, contador));
                      System.out.printf("\n");

        }
    }
    while(opcion != '4');
    teclado.close();
}
}
