package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Multiplicando:");
		int valorMultiplicacao = sc.nextInt();
		
		System.out.print("Início do intervalo:");
		int inicioIntervalo = sc.nextInt();
		
		System.out.print("Fim do intervalo:");
		int fimIntervalo = sc.nextInt();
		
		if (valorMultiplicacao > 1000 ||
			inicioIntervalo < 0 ||
			fimIntervalo < 0 ||
			inicioIntervalo > 1000 ||
			fimIntervalo > 1000 ||
			fimIntervalo - inicioIntervalo > 10 ||
			fimIntervalo < inicioIntervalo) {
			
			System.out.println("O usuario não compriu uma ou mais das regras: ");
			
			System.out.println("O multiplicando não pode ser maior que 1000.");
			
			System.out.println("Tanto o início como o fim do intervalo, não podem ser números negativos e não\r\n" + 
					"podem ser maiores de 1000.");
			
			System.out.println("O intervalo não pode ter uma diferença maior que 10." + 
					"Exemplo: Intervalo entre 1 e 10: válido; Intervalo entre 1 e 11: inválido.");
			
			System.out.println("O programa deve validar se o início do intervalo é menor que o fim." + 
					"Exemplo: Início = 1 e Fim = 3: Válido; Início = 3 e Fim = 1: Inválido.");
		} else {
			for (int i = inicioIntervalo; i <= fimIntervalo; i++) {
				System.out.println(valorMultiplicacao + " x " + i + " = " + valorMultiplicacao * i);
			}
		}
		sc.close();
	}

}
