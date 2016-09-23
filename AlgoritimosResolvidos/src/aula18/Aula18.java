package aula18;

/*
 * Obtendo a soma de duas matrizes
 */

public class Aula18 {
	public static void main(String[] args) {
		int[][] matrizUm = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] matrizDois = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][] soma = new int[matrizUm.length][matrizDois.length];
		
		for(int i = 0 ; i < soma.length ; i++){
			for(int j = 0; j < soma.length ; j++ ){
				soma[i][j] = matrizUm[i][j] + matrizDois[i][j];
				System.out.print(soma[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
