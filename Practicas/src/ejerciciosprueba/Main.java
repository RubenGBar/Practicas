package ejerciciosprueba;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int num = 0;
		double resultado = 0;
		
		num = pideNumero();
		
		Fibonnacci fib = new Fibonnacci(num);
		
		resultado = fib.Fibonnaci();
		
		System.out.println("La posición " + num + " en la sucesión de Fibonacci es: " + resultado);
		
	}

	public static int pideNumero() {
		int num = 0;
		
		boolean repetir = false;
		
		do {
			
			System.out.println("Introduzca un número");
			
			try {
				num = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Ha introducido un valor inocrrecto");
				repetir = true;
			}finally {
				sc.nextLine();
			}
			
			if(num < 0 || num > 20) {
				System.out.println("Debe introducir un número entre 1 y 20");
				repetir = true;
			}
			
		}while(repetir);
		
		return num;
	}
	
}
