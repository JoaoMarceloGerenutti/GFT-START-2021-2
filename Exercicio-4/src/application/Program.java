package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Multiplicando:");
		int valorMultiplicacao = sc.nextInt();
		
		System.out.print("In�cio do intervalo:");
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
			
			System.out.println("O usuario n�o compriu uma ou mais das regras: ");
			
			System.out.println("O multiplicando n�o pode ser maior que 1000.");
			
			System.out.println("Tanto o in�cio como o fim do intervalo, n�o podem ser n�meros negativos e n�o\r\n" + 
					"podem ser maiores de 1000.");
			
			System.out.println("O intervalo n�o pode ter uma diferen�a maior que 10." + 
					"Exemplo: Intervalo entre 1 e 10: v�lido; Intervalo entre 1 e 11: inv�lido.");
			
			System.out.println("O programa deve validar se o in�cio do intervalo � menor que o fim." + 
					"Exemplo: In�cio = 1 e Fim = 3: V�lido; In�cio = 3 e Fim = 1: Inv�lido.");
		} else {
			for (int i = inicioIntervalo; i <= fimIntervalo; i++) {
				System.out.println(valorMultiplicacao + " x " + i + " = " + valorMultiplicacao * i);
			}
		}
		sc.close();
	}

}
