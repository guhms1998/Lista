package br.com.generation.lista1;

import java.util.Scanner;

public class Ex1 {
	//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite um numero: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite um numero: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite um numero: ");
		n3 = leia.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O numero maior �:" + n1);
		}
		
		else if (n2 > n1 && n2 > n3){
			System.out.println("O numero maior �:" + n2);
		}
		
		else if(n3 > n2 && n3 > n1) {
			System.out.println("O numero maior �:" + n3);
		}
		else if(n3 == n2 && n2 ==n1) {
			System.out.println("Numeros iguais!!");
		}
		
		//if{
			//System.out.println("");
		//}
		
		
		
		

	}

}
