package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Atleta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Atleta> lista = new ArrayList<>();
		
		int distanciaOuro = 0;
		int distanciaPrata = 0;
		int distanciaBronze = 0;
		
		String medalhaOuro = "";
		String medalhaPrata = "";
		String medalhaBronze = "";
		
		// Adicionando os 10 atletas.
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o nome do Atleta " + i + ":");
			String nome = sc.next();
			
			System.out.print("Digite o país do Atleta " + i + ":");
			String pais = sc.next();
			
			System.out.print("Digite o resultado(em metros) do Atleta " + i + ":");
			int distanciaArremeso = sc.nextInt();
			
			lista.add(new Atleta(nome, pais, distanciaArremeso));
			
			// Verificando as medalhas.
			if (distanciaArremeso > distanciaOuro) {
				
				// Passando o podio.
				distanciaBronze = distanciaPrata;
				medalhaBronze = medalhaPrata;
				
				distanciaPrata = distanciaOuro;
				medalhaPrata = medalhaOuro;
				
				distanciaOuro = distanciaArremeso;
				medalhaOuro = nome;
			} else if (distanciaArremeso > distanciaPrata) {
				
				// Passando o podio.
				distanciaBronze = distanciaPrata;
				medalhaBronze = medalhaPrata;
				
				distanciaPrata = distanciaArremeso;
				medalhaPrata = nome;
			} else if (distanciaArremeso > distanciaBronze) {
				medalhaBronze = nome;
				distanciaBronze = distanciaArremeso;
			}
		}
		
		System.out.println("Ouro: " + medalhaOuro);
		System.out.println("Prata: " + medalhaPrata);
		System.out.println("Bronze: " + medalhaBronze);
		
		sc.close();
	}

}
