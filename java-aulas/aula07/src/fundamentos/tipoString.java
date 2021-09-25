package fundamentos;

public class tipoString {
	public static void main(String[] args) {
		System.out.println("Olá, galera!!!".charAt(1));//pegar uma letra apenas
		
		String s = "Bom dia!!";
		System.out.println(s.concat(", como vai você??"));//concatena variavel com outra ou texto
		System.out.println(s.startsWith("boa"));// se a variavel começa com a frase "boa"
		System.out.println(s.endsWith("noite!!!"));//se a variavel termina com "noite"
		System.out.println(s.length());// tamanho da string
		
	}
}
