/**
Autores: Atilio Almeida Costa & Matheus Angelo de Souza Santos
Matheus Angelo de Souza Santos
ADS 371 2024

10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas).
*/
import java.util.Scanner;

class TP02Ex10 {
   public static void main( String[] args ) {
      Scanner s = new Scanner(System.in);

      System.out.print("Digite a ordem da matriz (M): ");
      int m = s.nextInt();

      while (m > 10 || m <= 0) {
         System.out.println("A ordem da matriz deve estar entre 1 e 10.");
         System.out.print("Digite novamente a ordem da matriz (M): ");
         m = s.nextInt();
      }

      double[][] matriz = new double[m][m];

      System.out.println("Digite os elementos da matriz:");

      for (int i = 0; i < m; i++) {
         for (int j = 0; j < m; j++) {
             System.out.print("Digite o elemento para a posição [" + i + "][" + j + "]: ");
             matriz[i][j] = s.nextDouble();
         }
      }

      System.out.println("Matriz Original:");
      exibirMatriz(matriz);

      double[][] inversa = calcularInversa(matriz);
      System.out.println("Matriz Inversa:");
      exibirMatriz(inversa);
      s.close();
    }

    public static double[][] calcularInversa(double[][] matriz) {
        int n = matriz.length;
        double[][] inversa = new double[n][n];
        double det = determinante(matriz);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inversa[i][j] = cofator(matriz, j, i) / det;
            }
        }
        return inversa;
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