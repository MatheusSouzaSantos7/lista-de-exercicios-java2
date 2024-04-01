/* 
Autores: Atilio Almeida Costa & Matheus Angelo de Souza Santos
Matheus Angelo de Souza Santos
ADS 371 2024

9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.
*/
import java.util.Scanner;

class TP02Ex09 {
   public static void main (String[] args){
   Scanner s = new Scanner(System.in);

       
        System.out.print("Digite o número de linhas (M): ");
        int m = s.nextInt();
        System.out.print("Digite o número de colunas (N): ");
        int n = s.nextInt();

        while (m > 10 || n > 10) {
            System.out.println("A ordem da matriz excede o limite máximo de 10x10.");
            System.out.print("Digite novamente o número de linhas (M): ");
            m = s.nextInt();
            System.out.print("Digite novamente o número de colunas (N): ");
            n = s.nextInt();
    
        }

        int[][] matriz = new int[m][n];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o elemento para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = s.nextInt();
            }
        }

        System.out.println("Matriz Original:");
        exibirMatriz(matriz);

        System.out.println("Matriz Transposta:");
        int[][] transposta = calcularTransposta(matriz);
        exibirMatriz(transposta);

        s.close();
    }

    public static int[][] calcularTransposta(int[][] matriz) {
        int m = matriz.length;
        int n = matriz[0].length;

        int[][] transposta = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
   
   
   }
}