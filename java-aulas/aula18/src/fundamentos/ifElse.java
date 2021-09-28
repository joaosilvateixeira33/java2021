package fundamentos;

import javax.swing.JOptionPane;

public class ifElse {
	
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe um numero: ");
		int numero = Integer.parseInt(valor);
		
		boolean resultado = numero % 2 == 0;
		if(resultado) {
			System.out.println("Numero par");
		}else {
			System.out.println("Numero impar");
		}
	}
	
}
