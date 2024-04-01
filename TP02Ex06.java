/*
Autores: Atilio Almeida Costa & Matheus Angelo de Souza Santos
Matheus Angelo de Souza Santos
ADS 371 2024

6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
*/

import java.util.Scanner;

public class TP02Ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[][] matriz = new String[2][3];

        // Preencher a matriz
        for (int m = 0; m < matriz.length; m++) {
            for (int n = 0; n < matriz[m].length; n++) {
                System.out.println("Escreva o nome na célula " + m + "x" + n);
                matriz[m][n] = ler.nextLine();
            }
        }

        // Imprimir a matriz
        for (int m = 0; m < matriz.length; m++) {
            for (int n = 0; n < matriz[m].length; n++) {
                System.out.print("|" + matriz[m][n] + "| ");
            }
            System.out.println();
        }
    }
}
