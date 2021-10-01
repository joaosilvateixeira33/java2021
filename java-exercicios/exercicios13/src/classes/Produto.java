package classes;

public class Produto {
	
	String nomeProduto;
	double precoProduto;
	static double desconto = 0.25;
	
	double descontoProduto() {
		return precoProduto * (1- desconto);
	}
	
	double descontoPrimeiraCompra(double primeiraCompra) {
		return precoProduto * (1- desconto + primeiraCompra);
	}
	
	Produto(String nomeInicial){
		nomeProduto = nomeInicial;
	}//Construtor personalizado
	
	Produto(String nomeInicial, double precoInicial){
		nomeProduto = nomeInicial;
		precoProduto = precoInicial;
	}//Construtor personalizado
	
	Produto(){
		
	}//Construtor padrão
}
