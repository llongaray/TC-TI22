package Entrega1tc;

import java.util.Scanner;

public class questao6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamanho = 5;
		int[] valores = new int[tamanho];
		int min = 1, max = 20;
		int maior = 0, posicao = 0;
		for (int i = 0; i < tamanho; i++) {
			valores[i] = (min + (int) (Math.random() * (max - min)));
		}
		for (int i = 0; i < tamanho; i++) {
			if (maior == 0) {
				maior = valores[i];
			} else if (valores[i] > maior) {
				maior = valores[i];
				posicao = i;
			}
		}

		System.out.println("Posicao " + posicao + " | Numero " + maior);

		teclado.close();
	}
}
