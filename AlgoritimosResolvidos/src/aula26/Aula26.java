package aula26;
/*
 * 
 * Faça um procedimento que receba, por parametro um vetor B(10) de reais
 * e calcula o maior valor do vetor. A seguir, o procedimento deve dividir
 * todos os elementos de B pelo maior encontrado. 
 * O vetor deve retorna alterado.
 * 
 * 
 * 
 */
public class Aula26 {
	public static void main(String[] args) {
		double[] vetorA = {10.5, 8.4, 2.3, 15.5, 3.4, 3.3, 7.9, 6.4, 5.1};
		
		
		divisaoVetorMaior(vetorA);
		
	}

	private static void divisaoVetorMaior(double[] vetor) {
		double maior = 0;
		
		for(int i = 0 ; i < vetor.length ; i++){
			
			if(vetor[i] > maior){
				maior = vetor[i];
			}
			
		}
		
		for (int i = 0; i < vetor.length; i++) {
			
			vetor[i] = (vetor[i] / maior);
			System.out.printf("%.2f " , vetor[i]);
			
		}
	}
}
