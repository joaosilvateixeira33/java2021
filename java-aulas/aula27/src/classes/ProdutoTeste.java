package classes;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nomeProduto = "Notbook";
		p1.precoProduto = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nomeProduto = "Iphone 4s";
		p2.precoProduto = 4327.00;
		p2.desconto = 0.70;
		
		double totalCompra = p1.descontoProduto() + p1.descontoPrimeiraCompra(0);
		
		System.out.printf("O produto %s, custa R$%.2f", p1.nomeProduto, p1.precoProduto);
		System.out.printf("\ndesconto de %.2f", p1.desconto);
		System.out.printf("\nDesconto de primeira compra: %.2f", p1.descontoPrimeiraCompra(0));
		System.out.printf("\nTotal da compra: %.2f", totalCompra);
	}
}
