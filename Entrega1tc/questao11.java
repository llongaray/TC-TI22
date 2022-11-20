package Entrega1tc;

import java.util.Scanner;

public class questao11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um palavra: ");
		String normal = teclado.next(); 
		String invertida = new StringBuffer(normal).reverse().toString(); 
		System.out.println("Palavra: " + normal + " | Invertida: " + invertida + "\n");
		
		teclado.close();
	}
}
