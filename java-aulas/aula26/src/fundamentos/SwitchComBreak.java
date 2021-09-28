package fundamentos;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		String farol = "verde";
		switch (farol.toLowerCase()){
			case "verde": 
				System.out.println("Avance");
			break;
			case "amarelo":
				System.out.println("Atenção");
			break;
			case "vermelho":
				System.out.println("Pare");
			break;
		}
	}

}
