package aula31;

/*
 * Faça um procedimento que retorna, por parâmetro,
 * um vetor(5) com os 5 primeiros números perfeitos.
 * 
 * 5 primeiros números perfeitos: 6, 28, 496,8128,33.550.336, ....
 * 
 * Um número se diz perfeito se é igual à soma de seus divisores próprios. 
 * Divisores próprios de um número positivo N são todos os divisores inteiros positivos de N exceto o próprio N.
 *	 Por exemplo, o número 6, seus divisores próprios são 1, 2 e 3, cuja soma é igual à 6.
 *    				1 + 2 + 3 = 6
 *    Ref.:http://www.matematica.br/historia/nperfeitos.html 
 * 
 * https://www.youtube.com/watch?v=CBSZFahGM5g
 */
public class Aula31 {

	public static void main(String[] args) {
		//

		int[] vetorA = new int[5];
		int contador = 0;
		int valor = 3;
		int total = 0;

		for (int i = 2; i < valor; i = i + 2) {
			for (int j = i; j > 0; j--) {
				// System.out.println(i + " " + j );
				if (j < i && i % j == 0) {
					total += j;
					// System.out.println(i + " " + j );
				}
			}
			if (total == i) {
				vetorA[contador] = i;
				System.out.print(vetorA[contador] + " -> ");
				contador++;
				if (contador < 5) {
					valor = valor + 2;
				}
			} else {
				valor = valor + 2;
			}
			total = 0;
		}

	}

}
