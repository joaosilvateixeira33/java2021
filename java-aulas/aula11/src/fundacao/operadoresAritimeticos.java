package fundacao;

public class operadoresAritimeticos {
	public static void main(String[] args) {
		//System.out.println(2+3);
		
		var x = 8.0;
		double y = 2.2;
		
		System.out.printf("Soma = %.2f",(double)x + y);
		System.out.printf("\nMultiplica��o= %.2f",(double) x * y);
		System.out.printf("\nDivis�o = %.2f",(double) x / y);
		System.out.printf("\nSubtra��o = %.2f",(double) x - y);
		System.out.printf("\nResto da div = %.2f",(double) x % y);
		System.out.println("\n");
		
		var a = 1;
		int b = 7;
		
		System.out.printf("Soma = %d",(int) a + b);
		System.out.printf("\nMultiplica��o = %d",(int) a * b);
		System.out.printf("\nDivis�o = %d",(int) a / b);
		System.out.printf("\nSubtra��o = %d",(int) a - b);
		System.out.printf("\nResto da div = %d",(int) a % b);
	}
}
