package Entrega1tc;

import java.util.Scanner;

public class questao3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamanho = 20;
		String[] validacao = new String[tamanho];
		int limit1 = (-20), limit2 = (20);
		int positivos = 0, negativos = 0;
		int[] valores = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			System.out.println((i+1) + " - Digite um valor: ");
			int valor = teclado.nextInt();
			if (valor >= limit1 && valor <= limit2) {
				valores[i] = valor;
				validacao[i] = "Valido!";
			} else {
				System.out.println("Valor invalido!*\n");
				validacao[i] = "Invalido!";
			}
		}
		System.out.println("NUMEROS VALIDOS: \n");
		for (int i = 0; i < tamanho; i++) {
			if(validacao[i].equalsIgnoreCase("Valido!")) {	
				System.out.println("Valor: " + valores[i] + "\n");
				if(valores[i]>= 0) {
					positivos++;
				}else if(valores[i]<0) {
					negativos++;
				}
			}
		}
		System.out.println("Valores POSITIVOS: " + positivos + "\nValores Negativos: " + negativos + "\n");
		teclado.close();
	}
}
