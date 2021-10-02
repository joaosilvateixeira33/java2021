package classes;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String exibirData() {
		return String.format("\n%d/ %d/%d", dia, mes, ano);
	}
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
	}
	
	Data(int dia, int mesPadrao, int anoPadrao){
		this.dia = dia;
		mes = mesPadrao;
		ano = anoPadrao;
	}
	
	static void teste() {
		this(dia);
	}
}
