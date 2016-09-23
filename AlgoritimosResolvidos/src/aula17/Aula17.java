package aula17;
/*
 * Faça um algoritmo que leia uma matriz 4x4
 * e imprima na tela a soma dos elementos
 * abaixo da diagonal principal da matriz
 * 
 * 
 */
public class Aula17 {
	public static void main(String[] args) {
		int[][] matriz = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		int somaTotal = 0;
		
		for(int i = 0 ; i < matriz.length ; i++){
			for(int j = 0 ; j < matriz[i].length ; j++){
				//System.out.print(i + "" + j +" ");
				if( i > j){
					somaTotal += matriz[i][j];
				}
			}
			//System.out.println();
		}
		
		System.out.println(somaTotal);
	}
}
