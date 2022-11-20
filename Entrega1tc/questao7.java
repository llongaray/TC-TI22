package Entrega1tc;

import java.util.Scanner;

public class questao7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int tamanho = 20;
		int[] valores = new int[tamanho];
		int min = 1, max = 20;
		int soma = 0, media = 0, contador = 0;
		for (int i = 0; i < tamanho; i++) {
			valores[i] = (min + (int) (Math.random() * (max - min)));
			soma = soma + valores[i];
		}
		media = soma/tamanho;
		for (int i = 0; i < tamanho; i++) {
			if(valores[i]>media) {
				contador++;
			}
		}
		System.out.println("Valores acima da media " + media + " : " + contador);
			
		
		teclado.close();
	}
}
