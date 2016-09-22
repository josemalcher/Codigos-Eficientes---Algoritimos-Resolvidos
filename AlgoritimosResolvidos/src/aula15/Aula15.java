package aula15;
/*
 * obter a matriz transposta
 * 
 */
public class Aula15 {
	public static void main(String[] args) {
		int[][] matriz = {
				{2,0,3},
				{1,2,3},
				{3,2,1}
		};
		
		int[][] matrizTransposta = new int[matriz.length][matriz.length];
		
		for(int i = 0 ; i < matriz.length ; i++){
			for(int j = 0 ; j < matriz.length; j++){
				//matrizTransposta[j][j] = matriz[i][j]; original
				matrizTransposta[j][j] = matriz[j][i];
				System.out.print(matrizTransposta[j][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
