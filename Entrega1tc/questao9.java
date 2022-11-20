package Entrega1tc;

import java.util.Scanner;

public class questao9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamanho = 10;
		int[] valores1 = new int[tamanho];
		int[] valores2 = new int[tamanho];
		int[] valores3 = new int[tamanho];
		int[] valores4 = new int[tamanho];
		int min = 1, max = 20;
		for (int i = 0; i < tamanho; i++) {
			valores1[i] = (min + (int) (Math.random() * (max - min)));
			valores2[i] = valores1[i]*2;
			valores3[i] = valores2[i]*3;
			valores4[i] = valores3[i]/2;
		}

		for (int i = 0; i < tamanho; i++) {
			System.out.println("Valores ARRAY 1: " + valores1[i] + "\n");
		}
		System.out.println("\n");
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Valores ARRAY 2: " + valores2[i] + "\n");
		}
		System.out.println("\n");
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Valores ARRAY 3: " + valores3[i] + "\n");
		}
		System.out.println("\n");
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Valores ARRAY 4: " + valores4[i] + "\n");
		}


		teclado.close();
	}
}
