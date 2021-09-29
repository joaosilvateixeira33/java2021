package classes;

import java.util.Scanner;

public class DataTeste {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//data atual
		Data dataAtual = new Data();
		
		System.out.println("Insira a dia atual: ");
		dataAtual.dia = entrada.nextInt();
		
		System.out.println("Insira o mes atual: ");
		dataAtual.mes = entrada.next();
		
		System.out.println("Insira o ano atual: ");
		dataAtual.dia = entrada.nextInt();
		
		entrada.close();
		
		System.out.printf("Data atual: %d de %s de %d.", dataAtual.dia, dataAtual.mes, dataAtual.ano);
	}
}
