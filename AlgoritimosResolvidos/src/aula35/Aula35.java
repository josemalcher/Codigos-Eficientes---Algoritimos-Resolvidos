package aula35;

/*
 * Crie uma função que receba uma matriz de inteiros, imprima-a, com a doma de cada umadas colunas e linhas. Assim:
 * 
 * 10, 23, -19 | 14
 * 12,  3,   5 | 20
 *  9, -3,  22 | 28
 *  -----------
 *  31 23   8
 * 
 * 
 */
public class Aula35 {

	public static void main(String[] args) {
		
		int[][] matriz = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		somaLInhasColunas(matriz);
	}

	private static void somaLInhasColunas(int[][] matriz) {
		int somaL = 0 ;
		int[] somaC = new int[matriz.length];
		
		for (int i = 0; i < somaC.length; i++) {
			for (int j = 0; j < somaC.length; j++) {
				somaL += matriz[i][j];
				somaC[ j ] += matriz[i][j];
				System.out.print(matriz[i][j] + "   ");
			}
			System.out.println(" | " + somaL );
			somaL = 0;
		}
		System.out.println("------------");
		for (int i = 0; i < somaC.length; i++) {
			System.out.print(somaC[i] + "   ");
		}
	}

}
