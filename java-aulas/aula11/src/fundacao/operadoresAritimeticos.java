package fundacao;

public class operadoresAritimeticos {
	public static void main(String[] args) {
		//System.out.println(2+3);
		
		var x = 8.0;
		double y = 2.2;
		
		System.out.printf("Soma = %.2f",(double)x + y);
		System.out.printf("\nMultiplicação= %.2f",(double) x * y);
		System.out.printf("\nDivisão = %.2f",(double) x / y);
		System.out.printf("\nSubtração = %.2f",(double) x - y);
		System.out.printf("\nResto da div = %.2f",(double) x % y);
		System.out.println("\n");
		
		var a = 1;
		int b = 7;
		
		System.out.printf("Soma = %d",(int) a + b);
		System.out.printf("\nMultiplicação = %d",(int) a * b);
		System.out.printf("\nDivisão = %d",(int) a / b);
		System.out.printf("\nSubtração = %d",(int) a - b);
		System.out.printf("\nResto da div = %d",(int) a % b);
	}
}
