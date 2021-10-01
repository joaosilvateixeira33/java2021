package classes;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notbook", 4356.89);
		Produto.desconto = 0.50;
		
		
		
		System.out.printf("O produto %s, custa R$%.2f", p1.nomeProduto, p1.precoProduto);
		System.out.printf("\ndesconto de %.2f", Produto.desconto);
		System.out.printf("\nDesconto de primeira compra: %.2f", p1.descontoPrimeiraCompra(0));
		//System.out.printf("\nTotal da compra: %.2f", totalCompra);
	}
}
