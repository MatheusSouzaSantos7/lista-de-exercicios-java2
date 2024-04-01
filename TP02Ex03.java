/*
Autores: Atilio Almeida Costa & Matheus Angelo de Souza Santos
Matheus Angelo de Souza Santos
ADS 371 2024

3. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos; 
*/

import java.util.Scanner;

public class TP02Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] numeros;
        double maior_numero;
        int qt; // Quantidade de números
        int qt_numeros_positivos = 0; // Quantidade de números positivos no array.
        int qt_numeros_negativos = 0; // Quantidade de números negativos no array.
        double porcentagem_numeros_positivos;
        double porcentagem_numeros_negativos;
        double menor_numero;
        double soma = 0;
        double media;
        String escolha;

        while (true) {
            maior_numero = 0;
            qt = 0; // Quantidade de números
            qt_numeros_positivos = 0; // Quantidade de números positivos no array.
            qt_numeros_negativos = 0; // Quantidade de números negativos no array.
            porcentagem_numeros_positivos = 0;
            porcentagem_numeros_negativos = 0;
            menor_numero = 0;
            soma = 0;
            media = 0;

            while (true) {
                System.out.println("Escreva a quantidade de números que quer digitar. Máximo: 20");
                qt = ler.nextInt();
                if (qt <= 0 || qt > 20) {
                    System.out.println("Quantidade inválida! Escreva novamente.");
                } else {
                    numeros = new double[qt];
                    break;
                }
            }

            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Escreva o valor " + (i + 1) + ":");
                numeros[i] = ler.nextDouble();
            }

            // Calcular o maior valor.
            maior_numero = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > maior_numero) {
                    maior_numero = numeros[i];
                }
            }

            // Calcular o menor valor.
            menor_numero = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] < menor_numero) {
                    menor_numero = numeros[i];
                }
            }

            // Calcular a soma dos valores.
            for (int i = 0; i < numeros.length; i++) {
                soma += numeros[i];
            }
            System.out.println("Soma: " + soma);

            // Calcular a média aritmética dos valores.
            media = soma / numeros.length;
            System.out.println("Média: " + media);

            // Calcular a porcentagem dos valores positivos.
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] >= 0) {
                    qt_numeros_positivos++;
                }
            }
            porcentagem_numeros_positivos = ((double) qt_numeros_positivos / numeros.length) * 100;
            System.out.println("Porcentagem de números positivos: " + porcentagem_numeros_positivos + "%");

            // Calcular a porcentagem dos valores negativos.
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] < 0) {
                    qt_numeros_negativos++;
                }
            }
            porcentagem_numeros_negativos = ((double) qt_numeros_negativos / numeros.length) * 100;
            System.out.println("Porcentagem de números negativos: " + porcentagem_numeros_negativos + "%");

            System.out.println("");

            ler.nextLine(); // Limpa o buffer do teclado

            System.out.println("Você quer executar tudo de novo? s/n");
            escolha = ler.nextLine();

            if (escolha.equals("n")) {
                break;
            } else if (!escolha.equals("s")) {
                System.out.println("Comando não reconhecido. Vamos reiniciar o programa");
            }
        }
    }
}
