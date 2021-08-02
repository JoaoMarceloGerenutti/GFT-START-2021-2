package application;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random gerador = new Random();
		int numeroGerado = gerador.nextInt(7);
		
		System.out.println(numeroGerado);
		
		System.out.print("Digite um número de 0 a 7 para adivinhar o número sorteado!: ");
		int chute = sc.nextInt();
		
		while(chute != numeroGerado) {
			System.out.print("Voce errou, tente novamente: ");
			chute = sc.nextInt();
		}
		
		System.out.print("Voce ganhou! o número era: " + numeroGerado);
		
		sc.close();
	}

}