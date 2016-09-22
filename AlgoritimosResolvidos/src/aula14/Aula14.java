package aula14;

/*
 * inverter um array
 */
public class Aula14 {
	public static void main(String[] args) {
		int[] vetor = {1,2,3,4,5,6,7};
		int[] conteiner = new int[vetor.length];
		
		
		for(int i = 0 ; i < vetor.length ; i++){
			
			conteiner[i] = vetor[(vetor.length - i) - 1];
			System.out.print(conteiner[i] + " ");
			
		}
		
		
	}
}
