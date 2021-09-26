package fundacao;

public class tiposString {
	public static void main(String[] args) {
		System.out.println("Olá, pessoal".charAt(0));//mostra a letra 
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));// concatenar variavel ou frase
		System.out.println(s.startsWith("Bom"));// verifica se afrase começa com "Bom"
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().startsWith("Boa"));
		System.out.println(s.length());//tamanho da variavel
		System.out.println(s.toLowerCase().equals("boa tarde"));//igual
		System.out.println(s.equalsIgnoreCase("boa tarde")); //ignora o igual
		
		var nome = "Joao";
		var idade = 22;
		var salario = 1_059.00;
		
		String frase = String.format("Nome: %s\nIdade: %d anos\nrecebe: R$%.2f", nome, idade, salario);
		System.out.println(frase);
	}
}
