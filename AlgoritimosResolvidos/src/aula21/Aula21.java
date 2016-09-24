package aula21;

/*
 * Faça um procedimento que recebe 2 vetores A e B
 * de tamanho 5 de inteiros.
 * O Vetor B deve conter o somatorio de cada elemento de A.
 * 
 * 
 * 
 */
public class Aula21 {
	public static void main(String[] args) {
		
		int[] vetorA = {3,0,4,1,5};
		int[] vetorB = new int[vetorA.length];
		int conteiner = 0;
		
		for (int i = 0; i < vetorB.length; i++) {
			
			conteiner = vetorA[i];
			while(conteiner >= 0){
				vetorB[i] += conteiner;
				conteiner--;
			}
			
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
			
		}
		
		
	}
}
