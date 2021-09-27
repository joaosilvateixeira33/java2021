package desafioModulo3;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		Scanner usuarioDigita = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double num1 = usuarioDigita.nextDouble();
		
		System.out.println("Digite outro numero: ");
		double num2 = usuarioDigita.nextDouble();
		
		System.out.println("Informe uma operacao:(+ - / * %)");
		String operacao = usuarioDigita.next();
		
		//logica
		double resultado = "+".equals(operacao) ? num1+num2 : 0;
		resultado = "-".equals(operacao) ? num1-num2 : resultado;
		resultado = "/".equals(operacao) ? num1/num2 : resultado;
		resultado = "*".equals(operacao) ? num1*num2 : resultado;
		resultado = "%".equals(operacao) ? num1%num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao,  num2, resultado);
		
		usuarioDigita.close();
	}
}
