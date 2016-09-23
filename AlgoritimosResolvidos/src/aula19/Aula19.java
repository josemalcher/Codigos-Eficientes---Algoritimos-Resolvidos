package aula19;

/*
 *
 * Escreva um algoritmo que lê uma matriz (5,5) e calcule as somas:
 * a) da linha 4;
 * b) da coluna 2;
 * c) da diagonal principal
 * d) da diagonal secundaria
 * e) de todos os elementos da matriz
 * f) Escreva estas somas e a matriz
 * 
 */
public class Aula19 {
	public static void main(String[] args) {
		int[][] matriz = {
				{2,4,6,8,9},
				{1,3,5,7,8},
				{3,6,9,6,3},
				{8,6,4,2,4},
				{1,2,3,4,5}
		}; 
		
		int somaL = 0;
		int somaC = 0;
		int somaDP = 0;
		int somaDS = 0;
		int somaTotal = 0;
		
		for(int i = 0 ; i < matriz.length ; i++){
			for(int j = 0; j < matriz.length ; j++){
				//System.out.print(i + "" + j + " ");
				if(i == 3 ){somaL += matriz[i][j];}
				if(j == 3 ){somaC += matriz[i][j];}
				if(i == j ){somaDP += matriz[i][j];}
				if(i + j == 4 ){somaDS += matriz[i][j];}
				somaTotal += matriz[i][j];
			}
			System.out.println();
		}
		
		System.out.printf(" A soma da linha 4 e %d",somaL);
		System.out.printf("\n A soma da coluna 2 é %d", somaC);
		System.out.printf("\n A soma da diagonal principal é %d", somaDP);
		System.out.printf("\n A soma da diagonal secundaria é %d", somaDS);
		System.out.printf("\n A soma total da matriz é %d", somaTotal);
		
		for(int i = 0 ; i < matriz.length ; i++){
			for(int j = 0; j < matriz.length ; j++){
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
