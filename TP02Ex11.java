/**
Autores: Atilio Almeida Costa & Matheus Angelo de Souza Santos
Matheus Angelo de Souza Santos
ADS 371 2024

11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir determinante da matriz.
*/

import java.util.Scanner;
class TP01Ex11 {
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

        double determinanteMatriz = determinante(matriz);
        System.out.println("Determinante da matriz: " + determinanteMatriz);

        s.close();
    }

    public static double determinante(double[][] matriz) {
        int n = matriz.length;
        if (n == 1) {
            return matriz[0][0];
        }
        double det = 0;
        for (int j = 0; j < n; j++) {
            det += matriz[0][j] * cofator(matriz, 0, j);
        }
        return det;
    }

    public static double cofator(double[][] matriz, int linha, int coluna) {
        return Math.pow(-1, linha + coluna) * determinante(submatriz(matriz, linha, coluna));
    }

    public static double[][] submatriz(double[][] matriz, int excluiLinha, int excluiColuna) {
        int n = matriz.length;
        double[][] sub = new double[n - 1][n - 1];
        int linhaDestino = 0;
        for (int linha = 0; linha < n; linha++) {
            if (linha == excluiLinha) {
                continue;
            }
            int colunaDestino = 0;
            for (int coluna = 0; coluna < n; coluna++) {
                if (coluna == excluiColuna) {
                    continue;
                }
                sub[linhaDestino][colunaDestino] = matriz[linha][coluna];
                colunaDestino++;
            }
            linhaDestino++;
        }
        return sub;
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