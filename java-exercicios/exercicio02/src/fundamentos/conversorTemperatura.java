package fundamentos;

public class conversorTemperatura {
	public static void main(String[] args) {
		//formula conversao = (F° - 32)x 5/9 = C°
		double farenheint = 104.0;
		final int valorSub = 32;
		final double valorMult = 5/9.0;
		
		double conversorTemp = (farenheint - valorSub) * valorMult;
		
		System.out.println("temperatura em "+ conversorTemp + "C°");
		
		
	}
}
