package classes;

public class DataTeste {
	public static void main(String[] args) {
		
		Data data = new Data();
		data.dia = 11;
		data.mes = 03;
		data.ano = 1999;
		
		String dataFormatada = data.exibirData();
		
		System.out.println(dataFormatada);
	}
}
