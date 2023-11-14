package figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
	    // Declaro las variables
	    int numero, a = 1;

	    // Creo el Scanner
	    Scanner sc = new Scanner(System.in);

	    // Bucle do-while para asegurarse de que se ingrese un número positivo
	    do {
	        System.out.println("Introduzca un numero positivo, para crear una piramide de esta altura y base: ");

	        try {
	            // Leo el valor de numero del teclado
	            numero = sc.nextInt();
	        } catch (InputMismatchException e) {
	            // Si se produce una excepción, se establece el número en 1 y se muestra un mensaje de error
	            numero = 1;
	            System.out.println("Ha introducido un valor erroneo. Se introducira 1 como valor predeterminado");
	        }

	        // Si el número ingresado es menor que 1, muestra un mensaje de error
	        if (numero < 1)
	            System.out.println("Valor erroneo");

	    } while (numero < 1);

	    
	    System.out.println();

	    
	    for (int i = 1; i <= numero; i++) {
	      for (int j = 1; j <= numero; j++) {
	        if (j <= i) {
	        	System.out.print("* ");
	        }else if (j <= numero - i) {
	        	System.out.print(" ");
	        }
	       }
	    	
	    	/*for (int j = 1; j <= numero - i; j++) {
	            System.out.print(" ");
	        }

	       
	        for (int k = 1; k <= i; k++) {
	            System.out.print("* ");
	        }*/
	        
	        
	        System.out.println();
	        
	    }

	    // Cierro el Scanner
	    sc.close();
		
	}

}

