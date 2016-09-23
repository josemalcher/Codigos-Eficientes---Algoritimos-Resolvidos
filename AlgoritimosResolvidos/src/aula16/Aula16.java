package aula16;

/*
 * 
 * Faça um algoritmo que leia uma matriz 2x3
 * e imprima na tela a soma de todos
 * os elementos da matriz
 * 
 */
public class Aula16 {
	public static void main(String[] args) {
		
		int[][] matriz = {
				{10,20,30},
				{30,20,10}
				
		};
		
		int somaTotal = 0;
		
		for(int i = 0; i < 2 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				somaTotal += matriz[i][j];
			}
		}
		System.out.println(somaTotal);
		
	}
}
