import java.util.Scanner;

public class pruebaaaaaaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine();
        scanner.close();
        
        frase = frase.replaceAll("\\s+", "").toLowerCase();
        
        // Inicializar un array para contar las ocurrencias de cada letra del alfabeto
        int[] conteoLetras = new int[26];
        
        // Iterar sobre cada caracter de la frase
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            // Solo considerar letras del alfabeto inglés
            if (letra >= 'a' && letra <= 'z') {
                // Obtener el índice correspondiente a la letra en el array
                int indice = letra - 'a';
                // Incrementar el conteo de la letra en el array
                conteoLetras[indice]++;
            }
        }
        
        // Mostrar el resultado
        System.out.println("Resultado:");
        for (int i = 0; i < conteoLetras.length; i++) {
            // Solo mostrar letras con al menos una ocurrencia
            if (conteoLetras[i] > 0) {
                char letra = (char) ('a' + i);
                System.out.println(letra + ": " + conteoLetras[i] + " veces");
            }
        }
    }

}
