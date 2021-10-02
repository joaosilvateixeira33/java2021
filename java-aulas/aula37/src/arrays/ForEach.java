package arrays;

public class ForEach {
	public static void main(String[] args) {
		double[] notas = {9.9, 1.5, 9.5, 10};
		for(double nota: notas) {
			System.out.printf("[%.2f]", nota);
		}
	}
}
