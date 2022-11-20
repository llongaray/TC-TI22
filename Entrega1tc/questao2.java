package Entrega1tc;

import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int maior = 0, localMa = 0, localMn = 0, menor = 0, soma = 0, contador = 0;
		System.out.println("Digite o tamanho da ARRAY: ");
		int tamanho = teclado.nextInt();
		int[] valores = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor: ");
			int valor = teclado.nextInt();
			valores[i] = valor;
		}
//		A: O maior valor encontrado no array
//		B: O índice em que se encontrava o maior valor (se tiver dois valores iguais, informar o primeiro índice encontrado)
//		C: O menor valor encontrado no array
//		D: O índice em que se encontrava o menor valor (se tiver dois valores iguais, informar o primeiro índice encontrado)
//		E: A média dos valores presentes no array
//		F: Informe quantos valores, presentes no aray, estão acima da média
		for (int i = 0; i < tamanho; i++) {
			soma = soma+valores[i];
			if (maior == 0 && menor == 0) {
				maior = valores[i];
				menor = valores[i];
			} else if (valores[i] >= maior) {
				maior = valores[i];
				if (localMa == 0) {
					localMa = i + 1;
				} else if (maior != valores[i]) {
					localMa = i + 1;
				}
			} else if(valores[i] < menor){
				menor = valores[i];
				if (localMn == 0) {
					localMn = i + 1;
				} else if (maior != valores[i]) {
					localMn = i + 1;
				}
			}
		}
		int media = (soma / tamanho);
		for (int i = 0; i < tamanho; i++) {
			if (valores[i] > media) {
				contador++;
			}
		}
		
//		IMPRIMIR
		System.out.println("O maior valor eh: " + maior + " e ele se encontra na posicao "+ (localMa) +" na ARRAY.\n");
		System.out.println("O menor valor eh: " + menor + " e ele se encontra na posicao "+ (localMn-1) +" na ARRAY.\n");
		System.out.println("A media dos valores eh: " + media + "\n");
		System.out.println("Sao "+contador+" que estao acima da media.\n");
		
		teclado.close();
	}
}
