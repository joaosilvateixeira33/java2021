package controle;

import java.util.Scanner;

public class desafioDiasSemana {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana: ");
		String diaSemana = user.next();
		
		if(diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		}else if(diaSemana.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		}else if(diaSemana.equalsIgnoreCase("quarta")) {
			System.out.println(3);
		}else if(diaSemana.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		}else if(diaSemana.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		}else if(diaSemana.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		}else if(diaSemana.equalsIgnoreCase("sabado")){
			System.out.println(7);
		}else {
			System.out.println("Dia invalido!!");
		}
		
		user.close();
	}

}
