package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		System.out.println("Informe o numero de alunos na turma: ");
		int qtdAlunos = user.nextInt();
		
		System.out.println("Informe quantidade de notas por aluno: ");
		int qtdNotas = user.nextInt();
		
		double [][] notasTurma = new double[qtdAlunos][qtdNotas];
		
		double total = 0;
		for(int a = 0; a < notasTurma.length; a++) {
			for(int n = 0; n < notasTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d", n+1, a+1);
				notasTurma[a][n] = user.nextDouble();
				total += notasTurma[a][n];
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println(Arrays.toString(notasTurma));
		System.out.println(media);
		user.close();
	}
}
