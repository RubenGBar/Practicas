package figuras;

import java.util.Scanner;

public class Arbol {
	public static void main(String[] args) {
		int num, calculo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
		       
	        for (int j = 1; j <= num - i; j++) {
	            System.out.print(" ");
	        }

	        
	        for (int k = 1; k <= i; k++) {
	            System.out.print("* ");
	        }

	        
	        System.out.println();
	    }
		
		for (int l = num / 2; l <= num; l++) {
			
			for (int m = 1; m <= num - l; m++) {
				System.out.print(" ");
			}
			
			for (int n = 1; n <= l; n++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for (int o = 4; o <= num; o++) {
			
			for (int p = 2; p <= num; p++) {
				System.out.print(" ");
			}
			
			for (int q = 2; q <= o; q++) {
				if (q == o) {
				System.out.print("* ");
				}
			}
			
			System.out.println();
		}
		
		sc.close();
		
	}

}
