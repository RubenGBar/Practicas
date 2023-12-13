package examentema3;

import java.util.Random;

public class Tesoro {
	// Constante para indicar el tama�o del tablero
	public static final int TAM_TABLERO = 5;

	// Atributo que almacena la posici�n X del Tesoro
	static int xTesoro;

	// Atributo que almacena la posici�n Y del Tesoro
	static int yTesoro;

	// Atributo que almacena la posici�n X del Jugador
	int xJugador = 1;

	// Atributo que almacena la posici�n Y del Jugador
	int yJugador = 1;

	// Entrada: Vac�a
	// Salida: Vac�a
	// Funcionalidad: Generar n�mero aletorio entre 1
	// tama�o + 1 si vamos a utilizar Random
	static void generaPosicionTesoro() {
		Random rand = new Random();
		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
	}

	// Entrada: vac�a
	// Salida: vac�a
	// Funcionalidad: Un primer for para la primera l�nea
	// Otra bucle para pintar los n�meros de las l�neas
	// Si la posici�n X del Jugador coincide con la l�nea
	// creo otro for para imprimir los tabuladores que hay
	// antes del jugador. El n�mero de tabuladores coincide
	// con la posici�n Y del Jugador
	void pintaTablero() {
		// Imprimimos la primera l�nea de n�meros
		for (int i = 1; i <= TAM_TABLERO; i++) {
			System.out.print("\t" + i);
		}

		// Salto de l�nea para comenzar con los n�meros de la izquierda
		System.out.println();

		// Bucle para imprimir las l�neas
		for (int i = 1; i <= TAM_TABLERO; i++) {
			// Imprimimos el n�mero de l�nea
			System.out.print(i);
			// Si la l�nea coincide con la posici�n X del jugador
			if (xJugador == i) {
				/// Imprimimos tantos tabuladores como posici�n Y del jugador
				for (int j = 1; j <= yJugador; j++) {
					System.out.print("\t");
				}
				// Imprimimos la ficha del jugador
				System.out.print("J");
			}
			// Salto de l�nea para pasar a la siguiente l�nea
			System.out.println();
		}
	}

	// Entrada: String con el movimiento
	// Salida: int
	// 
	int mueveJugador(String movimiento) {
		int res = 0;
		String movMinuscula = movimiento.toLowerCase();

		switch (movMinuscula) {
		case "arriba":
			if (xJugador - 1 < 1) {
				res = -1;
			} else {
				xJugador--;
			}
			break;
		case "abajo":
			if (xJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				xJugador++;
			}
			break;
		case "izquierda":
			if (yJugador - 1 < 1) {
				res = -1;
			} else {
				yJugador--;
			}
			break;
		case "derecha":
			if (yJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				yJugador++;
			}
			break;
		default:
			res = -2;
			break;
		}		
		
		return res;
	}

	// Entrada: Vac�a
	// Salida: boolean
	// Funcionalidad: si X del Jugador es igual a x del Tesoro
	// y Y del Jugador es igual a Y del Tesoro devuelve true
	boolean buscaTesoro(){
		boolean res = false;
		if(xTesoro == xJugador && yTesoro == yJugador) {
			res = true;
		}
		return res;
	}
}