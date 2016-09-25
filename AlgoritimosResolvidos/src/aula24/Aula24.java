package aula24;
/*
 * Faça um método que recebe, por parametro,
 * um vetor vetorA[10] de double e retorna-o ordenado em ordem crescente
 * 
 * 
 */
public class Aula24 {
	public static void main(String[] args) {
		double[] vetorA = {9.9, 2.2, 4.4, 2.1, 20.3, 4.3,1.1, 1, -2, 100};
		ordenacao(vetorA);
		
		
		
		
		
		
		
	}

	private static void ordenacao(double[] vetor) {
		double temp = 0;
		
		
		for(int i = 0; i < vetor.length; i++){
			
			for(int j = i + 1 ; j < vetor.length ; j++){
				
				if(vetor[i] > vetor[j]){
					temp = vetor[i];
					vetor[i] = vetor[ j ];
					vetor[j] = temp;
				}
				
			}
			
		}
		
		for(int k = 0 ; k < vetor.length ; k++){
			
			System.out.println(k + 1 + "º: "+ vetor[k] + " ");
			
		}
	}
}
