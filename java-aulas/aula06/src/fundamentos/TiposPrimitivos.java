package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Tipos numericos inteiros
		byte anosEmpresa = 23;
		short voo = 542;
		int id = 12345;
		long pontosAcumulados = 14_324_223;
		
		//Tipos numericos reais
		float salario = 11_445.44f;
		double vendasAcumuladas = 4.0;
		
		//tipo boolean
		boolean estadoFerias = false;
		
		//Tipo caractere 
		char status = 'A';
		
		System.out.println("Dias de empresa: " + anosEmpresa*365);
		System.out.println("Viagens percorridas: " + voo / 2);
		System.out.println("DOTs acumulados: " + pontosAcumulados / vendasAcumuladas);
		System.out.println("Salario do funcionario: " + id + " => " + salario);
		System.out.println("Ferias? " + estadoFerias);
		System.out.println("Status: " + status);
	}
}
