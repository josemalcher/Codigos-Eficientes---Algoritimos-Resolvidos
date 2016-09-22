package aula12;

/*
 * Faça um algoritmo que some o conteúdo de dois 
 * vetores e armazene o resultado em um terceito vetor
 */
public class Aula12 {
	public static void main(String[] args) {
		
		int[] vetorUm = {1,10,20,30,40,50};
		int[] vetorDois = {50,40,30,20,20,10,1};
		int[] vetorTres = new int[vetorUm.length];
		
		for(int i = 0 ; i < vetorUm.length ; i++ ){
			System.out.print(vetorTres[i] = vetorUm[i] + vetorDois[i]);
			System.out.print(" ");
		}
		
	}
}
