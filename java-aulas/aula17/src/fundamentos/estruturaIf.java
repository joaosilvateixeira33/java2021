package fundamentos;

import java.util.Scanner;

public class estruturaIf {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a media do aluno: ");
		double media = entrada.nextDouble();
		
		boolean criterioAprovcaoAtingido = media <= 10 && media >= 7 ;
		if(criterioAprovcaoAtingido) {
			System.out.println("Parabens, Voce foi aprovado");
			System.out.println("Ate o proximo ano!!!");
		}
		
		boolean criterioReprovcaoAtingido = media < 7 && media >= 4.5 ;
		if(criterioReprovcaoAtingido) {
			System.out.println("poxa, Voce foi reprovado");
			System.out.println("Recuperação!!!");
		}
		entrada.close();
	}
}
