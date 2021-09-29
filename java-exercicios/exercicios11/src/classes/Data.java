package classes;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String exibirData() {
		return String.format("\n%d/ %d/%d", dia, mes, ano);
	}
}
