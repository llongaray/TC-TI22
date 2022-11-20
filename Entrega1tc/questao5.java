package Entrega1tc;

import java.util.Scanner;

public class questao5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int tamanho = 5;
		int[] A = new int[tamanho];
		int min = 0, max = 10;
		boolean[] validacao = new boolean[tamanho];
		for (int i = 0; i < tamanho; i++) {
			A[i] = (min + (int)(Math.random()*(max-min)));
		}
		for (int i = 0; i < tamanho; i++) {
			if(A[i] == i) {
				validacao[i] = true;
			}else {
				validacao[i] = false;
			}
		}
		for (int i = 0; i < tamanho; i++) {
			if(validacao[i] == true) {
				System.out.println("Posição " + i + " | numero " + A[i] + " | validacao: " + validacao[i]);
			}
		}
		System.out.println("\n___________________\n");
		for (int i = 0; i < tamanho; i++) {
			if(validacao[i] == false) {
				System.out.println("Posição " + i + " | numero " + A[i] + " | validacao: " + validacao[i]);
			}
		}

		
		teclado.close();
	}
}
