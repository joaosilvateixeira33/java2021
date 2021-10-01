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
	
	Produto(String nomeInicial){
		nomeProduto = nomeInicial;
	}//Construtor personalizado
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nomeProduto = nomeInicial;
		precoProduto = precoInicial;
		
		desconto = descontoInicial;
	}//Construtor personalizado
	
	Produto(){
		
	}//Construtor padrão
}
