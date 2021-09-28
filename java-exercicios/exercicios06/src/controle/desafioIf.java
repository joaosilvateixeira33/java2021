package controle;

public class desafioIf {
	public static void main(String[] args) {
		double nota = 1.3;
		
		if(nota >= 9.0) {//com o uso da virgula causa bug e nao termina o bloco if
			System.out.println("Voce esta no quadro de honra");
			System.out.println("Voce e fera");
		}	
		System.out.println(nota);
	}
}
