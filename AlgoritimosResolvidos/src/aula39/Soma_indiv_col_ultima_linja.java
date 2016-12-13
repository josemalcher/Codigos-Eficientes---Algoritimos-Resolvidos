package aula39;
/*
 * Faça um método que receba, por parâmetro, uma matriz 6x5.
 * O procedimento deve somar individualmente as colunas da mariz e
 * armazenar o resultado na 6ª linha da matriz. O método deve
 * retornar a matriz alterada.
 * 
 */
public class Soma_indiv_col_ultima_linja {

	public static void main(String[] args) {
		
		int[][] matriz = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{1,2,3,4,5},
				{2,3,4,5,6}
		};
		
		coluna_ultima_linha(matriz);

	}

	private static void coluna_ultima_linha(int[][] matriz) {
		int[] somaColIndividual = new int[5];
		
		for (int i = 0; i < 6 ; i++) {
			for (int j = 0; j < 5 ; j++) {
				if(i < 5){
					somaColIndividual[j] += matriz[i][j];
					System.out.print(matriz[i][j] + " ");
				}else{
					matriz[i][j] += somaColIndividual[j];
					System.out.print(matriz[i][j] + " ");
				}
			}
			System.out.println( );
		}
	}

}
