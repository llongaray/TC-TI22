package Entrega1tc;

import java.util.Scanner;

public class questao4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamanho = 5;
		int[] a = new int[tamanho];
		int x = 5;
		int min = 0, max = 10;
		int contador=0;
		for (int i = 0; i < tamanho; i++) {
			a[i] = (min + (int)(Math.random()*(max-min)));
		}
		for (int i = 0; i < tamanho; i++) {
			if(a[i] == x) {
				contador++;
			}
		}
		System.out.println("O numero " + x + " aparece na ARRAY " + contador + " vezes.\n");

		teclado.close();
	}
}
