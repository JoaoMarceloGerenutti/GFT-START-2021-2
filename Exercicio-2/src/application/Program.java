package application;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random gerador = new Random();
		int numeroGerado = gerador.nextInt(7);
		
		System.out.println(numeroGerado);
		
		System.out.print("Digite um n�mero de 0 a 7 para adivinhar o n�mero sorteado!: ");
		int chute = sc.nextInt();
		
		while(chute != numeroGerado) {
			System.out.print("Voce errou, tente novamente: ");
			chute = sc.nextInt();
		}
		
		System.out.print("Voce ganhou! o n�mero era: " + numeroGerado);
		
		sc.close();
	}

}