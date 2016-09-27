package aula27;

/*
 * Faça uma função que recebe, por parametro, uma matriz(7,6)
 * e retorna a soma dos elementos da linha 5 e da coluna 3.
 */
public class Aula27 {
	public static void main(String[] args) {
		int[][] matrizA = {
				{1,2,3,4,5,6},
				{7,8,9,10,11,12},
				{13,14,16,17,16,18},
				{19,20,21,22,23,24},
				{25,26,27,28,29,30},
				{31,32,33,34,35,36},
				{37,38,39,40,41,42},
				
		};
		
		somaLinaColuna(matrizA);
	}

	private static void somaLinaColuna(int[][] matrizA) {
		int somaL = 0;
		int somaC = 0;
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				if( i == 4){
					somaL += matrizA[i][j];
				}
				if(j == 2){
					somaC += matrizA[i][j];
				}
				
			}
			
		}
		System.out.println("A Soma dos elementos da linha 5 = "+ somaL +"\n"
				+ "Soma dos elementos da coluna 3 = "+ somaC);
	}
}
