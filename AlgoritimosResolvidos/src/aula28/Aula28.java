package aula28;

/*
 * Faça um procedimento que recebe 2 vetores A e B de tamanho 10 de inteiros, por parâmetro.
 * O procedimento deve retornar um vetor C, por parâmetro, que contem os elementos de A e B em ordem DECRESCENTE.
 */
public class Aula28 {
	public static void main(String[] args) {
		int[] vetorA = { -5, -3, -4, -5, 2, 0, 4, 10, 9, 8 };
		int[] vetorB = { -10, 10, 9, 4, -2, 3, 4, -5, 11, 2 };

		int[] vetorC = new int[vetorA.length + vetorB.length];

		int cont = 0;
		int temp = 0;

		for (int i = 0; i < vetorA.length; i++) {
			vetorC[cont] = vetorA[i];
			cont++;
			vetorC[cont] = vetorB[i];
			cont++;
		}

		System.out.print("Vetor C = { ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");

		}
		System.out.print(" }");

		for (int i = 0; i < vetorC.length; i++) {
			for (int j = 0; j < vetorC.length; j++) {

				if (vetorC[i] > vetorC[j]) {
					temp = vetorC[i];
					vetorC[i] = vetorC[j];
					vetorC[j] = temp;
				}

			}

		}
		System.out.println();
		System.out.print("Vetor C = { ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");

		}
		System.out.print(" }");

	}
}
