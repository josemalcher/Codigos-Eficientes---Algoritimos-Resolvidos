package aula25;

/*
 * 
 * Faça um procedimento que recebe, por parametro,
 * 2 vetores de 5 elementos inteiros e que calcule e retorne,
 * também por parâmetro, o vetor intersecção dos dois primeiros.
 * 
 */
public class Aula25 {
	public static void main(String[] args) {
		
		int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
		int[] vetorB = {1,20,30,40,50,60,7,8,90,10};
		
		interseccao(vetorA, vetorB);
		
		
	}

	private static void interseccao(int[] vetorA, int[] vetorB) {
		int tamanho = 0;
		
		//pega o tanho do novo vetor
		for(int i = 0 ; i < vetorB.length; i++){
			for (int j = 0; j < vetorB.length; j++) {
				if(vetorB[j] == vetorA[i]){
					tamanho++;
				}
				
			}
		}
		
		int[] vetorC = new int[tamanho];
		tamanho = 0;
		
		for (int i = 0; i < vetorB.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				
				if(vetorB[j] == vetorA[i]){
					vetorC[tamanho] = vetorB[j];
					System.out.print(vetorC[tamanho] + " ");
					tamanho++;
				}
				
			}
			
		}
	}
}
