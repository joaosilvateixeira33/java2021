package controle;

import java.util.Scanner;

public class desafioWhile {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		System.out.println("Charada: O que corre em pé e cai deitado?  ");
		String resposta = user.next();
		resposta.equalsIgnoreCase(resposta);
		
		while(resposta!= "chuva"){
			System.out.println("resposta incorreta");
		}
		System.out.println("resposta certa!!");
		user.close();
	}
}
