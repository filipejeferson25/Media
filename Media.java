package Exercicios;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		int qtdeNotas = 0, n = 0, a = 0;
		double total = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("informe a quantidade de notas a cadastrar:");
		qtdeNotas = input.nextInt();
		
		double notas[] = new double[qtdeNotas];
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Informe a " + (n + 1) + "° nota: ");
			notas[i] = input.nextDouble();
			total+=notas[i];
			n++;
		}
		
		System.out.println("\n     =========   NOTAS CADASTRADAS   ==========\n");
		for(double nota: notas) {
			System.out.println("	Nota " + (a + 1) + ": " + nota);
			a++;	
		}
		
		System.out.println("\n\n   -------------------------------------------");
		double media = total/qtdeNotas;
		System.out.printf("\nA média das notas é: %.2f", media);
		input.close();

	}

}
