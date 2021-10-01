package classes;

public class areaCirc {
	double raio;
	static final double PI = 3.14;
	
	areaCirc(double raioInicial){
		//pi = 3.14;
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
}
