package Entrega1tc;

import java.util.Scanner;

public class questao1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tamanho da ARRAY: ");
		int tamanho = teclado.nextInt();
		int[] valores = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor: ");
			int valor = teclado.nextInt();
			valores[i] = valor;
		}
		System.out.println("\n\nDigite um multiplicador inteiro: ");
		int multiplicador = teclado.nextInt();
		for (int i = 0; i < tamanho; i++) {
			valores[i] = (valores[i] * multiplicador);
		}
		for (int i = 0; i < tamanho; i++) {
			System.out.println((i + 1) + "º valor: " + valores[i]);
		}
		System.out.println("FIM!!!!");
		teclado.close();
	}
}
