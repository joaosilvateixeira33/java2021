package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NotasAluno {
	
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		//Ususario digita quantas notas quer inserir
		System.out.println("Insira quanatas notas deseja:  ");
		int indice = user.nextInt();
		double[]indices = new double[indice];
		
		//Usuario digita as notas e mostra-las
		double[] notas = new double[indice];
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + (i+1) + " :");
			notas[i] = user.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			 total += nota;
		}
		 
		double media = total / notas.length;
		System.out.println("a media é: " + media);
		
		user.close();
	}
}
