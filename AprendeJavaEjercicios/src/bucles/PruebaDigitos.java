package bucles;



public class PruebaDigitos {

	  long tiempo_inicio1, tiempo_inicio2, tiempo_inicio3, tiempo_fin1, tiempo_fin2, tiempo_fin3, total1, total2, total3;
	  int numero,contador;

	  public PruebaDigitos()
	  {
	    numero = 33982332;
	    contador = 1000000;
	  }   

	  public void metodo1()
	  {
	    int digitos;
	    tiempo_inicio1  = System.currentTimeMillis();

	    for(int x = 0; x<contador; x++)
	    {
	     digitos = Integer.toString(numero).length();
	    }

	    tiempo_fin1 = System.currentTimeMillis();
	    total1 = tiempo_fin1 - tiempo_inicio1;
	  }

	  public void metodo2()
	  {
	    int digitos;
	    tiempo_inicio2  = System.currentTimeMillis();

	    for(int x = 0; x<contador; x++)
	    {
	      digitos = (int)(Math.log10(numero)+1);
	    }

	    tiempo_fin2 = System.currentTimeMillis();
	    total2 = tiempo_fin2 - tiempo_inicio2;
	  }

	  public void metodo3()
	  {
	    int digitos = 0;
	    tiempo_inicio3  = System.currentTimeMillis();

	    for(int x = 0; x<contador; x++)
	    {
	      int num = numero;
	      while(num !=0)
	      {
	        num = num/10;
	        digitos++;
	      }
	    } 

	    tiempo_fin3 = System.currentTimeMillis();
	    total3 = tiempo_fin3 - tiempo_inicio3;
	  }

	  public static void main(String args[]) 
	  {

	   PruebaDigitos ejemplo = new PruebaDigitos();

	   ejemplo.metodo1();
	   ejemplo.metodo2();
	   ejemplo.metodo3();



	   System.out.println("Tiempo empleado con método 1 (Convirtiendo a String) = " + ejemplo.total1);
	   System.out.println("Tiempo empleado con método 2 (Usando Math)           = " + ejemplo.total2);
	   System.out.println("Tiempo empleado con método 3 (Divisiones entre 10)   = " + ejemplo.total3);   
	  }
	}