/*
Autores: Atilio Almeida Costa & Matheus Angelo de Souza Santos
Matheus Angelo de Souza Santos
ADS 371 2024

 2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores. 
*/

import java.util.Scanner;

public class TP02Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] numeros = new double[10];
        double maior_numero;
        double soma = 0;
        double media = 0;

        System.out.println("Leitor de valores.");
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Escreva o valor " + (i+1));
            numeros[i] = ler.nextInt();
        }
        // Calcular o maior número
        maior_numero = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior_numero) {
                maior_numero = numeros[i];
            }
        }

        System.out.println("Maior número: " + maior_numero);
        
        // Calcular a soma
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("Soma: " + soma);
        
        // Calcular a média
        media = soma / numeros.length;
        System.out.println("Média: " + media);
    }
}
