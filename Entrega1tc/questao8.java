package Entrega1tc;

import java.util.Scanner;

public class questao8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamanho = 10;
		String[] nomes = new String[tamanho];
		String nome = "Sara";
		for (int i = 0; i < tamanho; i++) {
			System.out.println((i + 1) + " - Digite um nome: ");
			nome = teclado.next();
		}
		System.out.println("Digite o nome que deseja procurar: ");
		nome = teclado.next();
		for (int i = 0; i < tamanho; i++) {
			if (nomes[i].equalsIgnoreCase(nome)) {
				System.out.println("Nome encontrado!\n");
			}
		}
		teclado.close();
	}
}
