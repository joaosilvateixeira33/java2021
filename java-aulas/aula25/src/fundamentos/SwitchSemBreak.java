package fundamentos;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String farol = "verde";
		switch (farol.toLowerCase()){
			case "verde": 
				System.out.println("Avance");
			case "amarelo":
				System.out.println("Atenção");
			case "vermelho":
				System.out.println("Pare");
		}
	}

}
