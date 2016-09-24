package aula20;

/*
 * Faça um procedimento que recebe um vetor de 10 elementos
 * inteiros, por parametro, e retorna, também por parametro, dois vetores A e B.
 * O vetor A deve conter os elementos Pares e o vetor B, os elementos impares.
 * 
 */
public class Aula20 {
	public static void main(String[] args) {

		Procedimento();
		
	}

	static void Procedimento() {
		int[] vetor = { 4, 51, 2, 83, 23, 15, 7, 12, 10, 6 };

		int contA = 0;

		// conta quantidade de pares
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				contA++;
			}
		}
		
		int[] A = new int[contA];
		int[] B = new int[vetor.length - A.length];

		System.out.println("Vetor A: ");
		for (int i = 0, j = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				A[j] = vetor[i];
				System.out.print(A[j] + " ");
				j++;
			}
		}
		System.out.println();
		System.out.println("Vetor B: ");
		for (int i = 0, j = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 != 0) {
				B[j] = vetor[i];
				System.out.print(B[j] + " ");
				j++;
			}
		}
	}
}
