package aula36;

import java.util.Arrays;

public class ArraysExercicio {
	
	public static void main(String[] args) {
		double [] notasAluno = new double[5];//criando array por indice
		System.out.println(Arrays.toString(notasAluno));
		notasAluno[0] = 2.0;
		notasAluno[1] = 4.0;
		notasAluno[2] = 6.0;
		notasAluno[3] = 8.0;
		notasAluno[4] = 10.0;
		
		System.out.println(Arrays.toString(notasAluno));
		double totalAluno = 0;
		for(int i= 0; i < notasAluno.length; i++) {
			totalAluno += notasAluno[i];
		}
		
		System.out.println(totalAluno / notasAluno.length);
		
		System.out.println("\n");
		
		double [] notasAlunoB = {1.0, 6.0, 7.5, 10};
		System.out.println(Arrays.toString(notasAlunoB));//criando array por valor
		double totalAlunoB = 0;
		for(int i= 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
