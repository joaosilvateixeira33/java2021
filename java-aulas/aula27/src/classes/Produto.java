package classes;

public class Produto {
	
	String nomeProduto;
	double precoProduto;
	double desconto;
	
	double descontoProduto() {
		return precoProduto * (1- desconto);
	}
	
	double descontoPrimeiraCompra(double primeiraCompra) {
		return precoProduto * (1- desconto + primeiraCompra);
	}
	
//	double precoFinal() {
//		
//	}
	
}
