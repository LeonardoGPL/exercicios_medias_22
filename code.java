package media;

import java.util.Scanner;

public class aulap {

	public static void main(String[] args) {
		Scanner batman = new Scanner(System.in);
		// inserindo variaveis
		float ac1 = (float) 0.15, ac2 = (float) 0.30, pg = (float) 0.10, af = (float) 0.45, ac1n, ac2n, pgn, afn;
		// exibindo na tela o texto em parenteses
		System.out.println("Digite sua nota da AC1:");
		// atribuindo o valor que o usuario digitou
		ac1n = batman.nextFloat();
		System.out.println("Digite sua nota da AC2:");
		ac2n = batman.nextFloat();
		System.out.println("Digite sua nota da Prova Geral:");
		pgn = batman.nextFloat();
		System.out.println("Digite sua nota da Prova Final:");
		afn = batman.nextFloat();
		// inserindo uma variavel com expressoes matematicas
		float m = (ac1 * ac1n) + (ac2 * ac2n) + (pg * pgn) + (af * afn);
		// encerando a classe
		batman.close();
		// criando condição
		if (m >= 5) {
			System.out.printf("\nSua media e %f, voce esta aprovado", m);
		} else {
			System.out.printf("\nSua media e %f, voce esta reprovado", m);
		}

	}

}
