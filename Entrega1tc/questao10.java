package Entrega1tc;

import java.util.Scanner;

public class questao10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um palavra: ");
		String normal = teclado.next(); 
		String invertida = new StringBuffer(normal).reverse().toString(); 
		if(normal.equalsIgnoreCase(invertida)){ 
			System.out.println("Eh um palindromo!");
		}else{ 
			System.out.println("Nao eh um palindromo!");
		}	
		
		
		teclado.close();
	}
}
