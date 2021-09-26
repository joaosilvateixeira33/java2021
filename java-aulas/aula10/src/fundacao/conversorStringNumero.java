package fundacao;

import javax.swing.JOptionPane;

public abstract class conversorStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite um numero");
		String valor2 = JOptionPane.showInputDialog("Digite outro numero");
		
		System.out.println(valor1 + valor2);
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		double soma = num1 + num2;
		System.out.printf("Soma = %.2f\n", soma);
		System.out.printf("Média = %.2f", soma / 2);

	}
}
