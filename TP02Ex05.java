/*
Autores: Atilio Almeida Costa & Matheus Angelo de Souza Santos
Matheus Angelo de Souza Santos
ADS 371 2024

5.Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
*/
import java.util.Scanner;

public class TP02Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[][] matriz = new double[3][2];

        // Preencher a matriz
        for (int m = 0; m < matriz.length; m++) {
            for (int n = 0; n < matriz[m].length; n++) {
                System.out.println("Escreva o valor da célula " + m + "x" + n);
                matriz[m][n] = ler.nextDouble();
            }
        }

        // Imprimir a matriz
        for (int m = 0; m < matriz.length; m++) {
            for (int n = 0; n < matriz[m].length; n++) {
                System.out.print("|" + matriz[m][n] + "| ");
            }
            System.out.println(); // Adicionar uma nova linha após cada linha da matriz
        }
    }
}
