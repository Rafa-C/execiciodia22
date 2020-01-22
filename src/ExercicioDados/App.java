package ExercicioDados;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random teste = new Random();

        System.out.print("Quantos lados?: ");
        int lados = ler.nextInt();

        System.out.print("Quantas vezes?: ");
        int vezes = ler.nextInt();

        int soma = 0; // essa varial será usada para somar os numeros aleatorios
        for(int i = 0; i < vezes; i++){ // Aqui criamos o contador i, ele que gera o numeros de vezes, se for igual 5, cinco numeros serao produzidos
          int  numero = teste.nextInt(lados)+1; // aqui estamos atribuindo os numeros aleatoris há variavel numero
          System.out.println(numero);
          soma += numero; // aqui soma os numeros aleatorios, eles so somam por causa do simbolo +=

        }

        System.out.println("A soma é: " + soma);









    }
}
