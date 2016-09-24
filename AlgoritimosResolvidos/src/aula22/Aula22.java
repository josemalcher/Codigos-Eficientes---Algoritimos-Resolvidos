package aula22;

/*
 * Faça um algoritmo que reecbe por parâmetro, um vetor A[10]
 * de inteiros e substitua todos os valores negativos por A por zero.
 * O vetor A deve ser retornado alterado.
 * 
 */
public class Aula22 {
	public static void main(String[] args) {
		
		
		int[] vetorA = {10,5,-4,-5, 2,3,-4,-2,0,12,99,-99};
		
		for (int i = 0; i < vetorA.length; i++) {
			
			if(vetorA[i] < 0){
				vetorA[ i ] = 0;
			}
			System.out.print(vetorA[i] + " ");
		}
	}
}
