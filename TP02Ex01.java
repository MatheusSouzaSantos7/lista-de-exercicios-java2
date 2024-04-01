/*
Autores: Atilio Almeida Costa & Matheus Angelo de Souza Santos
Matheus Angelo de Souza Santos
ADS 371 2024

1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor. 
*/
import java.util.Scanner;

class TP02Ex01{
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        double[] numeros = new double[2];

        System.out.println("Escreva dois valores. O segundo deverá ser maior que o primeiro.");
        System.out.println("Escreva o primeiro número: ");
        numeros[0] = ler.nextInt();
        System.out.println("Escreva o segundo número: ");
        
        while(true){

            numeros[1] = ler.nextInt();
            System.out.println("Valor 1: " + numeros[0] + ". Valor 2: " + numeros[1]);

            if(numeros[0] < numeros[1]){
                break;
            } else {
                System.out.println("O primeiro número é igual ou maior que o segundo! escreva novamente o segundo valor:");
            }
        }
    }
}