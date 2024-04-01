/*
Autores: Atilio Almeida Costa & Matheus Angelo de Souza Santos
Matheus Angelo de Souza Santos
ADS 371 2024

8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
colunas.
*/
import java.util.Scanner;

class TP02Ex08 {
   public static void main (String[] args){
   Scanner s = new Scanner(System.in);

        double[][] matrizOriginal = new double[3][4];
        double[][] matrizResultante = new double[3][4];

        System.out.println("Digite os doze valores para preencher a matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = s.nextDouble();
            }
        }

        System.out.print("Digite a constante multiplicativa: ");
        double constante = s.nextDouble();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrizResultante[i][j] = matrizOriginal[i][j] * constante;
            }
        }

        System.out.println("Matriz Original:");
        exibirMatriz(matrizOriginal);

        System.out.println("Matriz Resultante:");
        exibirMatriz(matrizResultante);

        s.close();
    }

    public static void exibirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
   
   }
}