package aula30;

/*
 * Faça um procedimento que receba, por parâmetro, uma matriz A(5,5) e retorna
 * um vetor com a soma de cada uma das linhas da Matriz A.
 */
public class SomaDeCadaLinhaMatriz {

	public static void main(String[] args) {
		//

		int[][] matrizA = { 
				{  1,  2,  3,  4,  5 }, 
				{  6,  7,  8,  9, 10 }, 
				{ 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20 }, 
				{ 21, 22, 23, 24, 25 } };
		
		int[] soma = new int[matrizA.length];
		
		somaLinhas(matrizA, soma);

	}

	private static void somaLinhas(int[][] matrizA, int[] soma) {
		int auxiliar = 0;
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				auxiliar += matrizA[i][j];
			}
			soma[i] = auxiliar;
			System.out.println("Soma dos elements da linha " + (i+1)+ " da matriz A " + soma[i]);
			auxiliar = 0;
		}
	}
}
