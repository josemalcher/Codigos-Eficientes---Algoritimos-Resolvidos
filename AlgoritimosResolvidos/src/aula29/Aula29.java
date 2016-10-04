package aula29;
/*
 * 
 * Faça um método que receba, por parâmetro, uma matriz Matriz(6,6) de reais,
 * e retorna a soma dos elementos das linhas pares de B
 * 
 */
public class Aula29 {

	public static void main(String[] args) {
		
		int[][] M = {
				{01,02,03,04,05,06},
				{00,03,00,00,00,02},
				{13,14,15,16,17,18},
				{00,00,01,00,03,04},
				{25,26,27,28,23,30},
				{00,02,03,00,00,00},
		};
		
		somaPares(M);

	}

	private static void somaPares(int[][] matriz) {
		int soma = 0 ;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i % 2 != 0){
					soma += matriz[i][j];
				}
				
			}
		}
		System.out.println("Soma das linhas pares: "+soma);
	}

}
