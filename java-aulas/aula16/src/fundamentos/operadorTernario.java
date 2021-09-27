package fundamentos;

public class operadorTernario {
	public static void main(String[] args) {
		//cliente compra produto porem para garantir desconto so acima de 100,00
		double produto1 = 25.00;
		double produto2 = 3.00;
		double produto3 = 0.50;
		double produto4 = 2.00;
		double desconto = 100.00;
		double carrinho = (int)produto1 + produto2+ produto3+ produto4 ; 
		
		String fecharCompra = carrinho >= desconto ? "Desconto de 10% ativado" : "Desconto nao ativado";
		
		System.out.println(fecharCompra);
		
	}
}
