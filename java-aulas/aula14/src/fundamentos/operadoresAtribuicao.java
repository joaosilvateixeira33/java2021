package fundamentos;

public class operadoresAtribuicao {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; //c + b;
		c -= b; //c - b;
		c *= b; //c * b;
		c /= b; //c \ b;
		c %= 2; //c % 2; 0 ou 1
		
		System.out.println(c);
	}
}
