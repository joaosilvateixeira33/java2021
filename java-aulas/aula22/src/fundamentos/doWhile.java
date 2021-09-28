package fundamentos;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Deseja sair? [S/N]");
			texto = user.nextLine();
		}while(!texto.equalsIgnoreCase("S"));
		 System.out.println("finalizando...");
		user.close();
	}
	
}
