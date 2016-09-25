package aula23;

/*
 * Faça um algoritmo que gera os 10 primeiros primos acimsa de 100
 * e retorna-os em um vetor vetorA[10]
 */
public class Aula23 {
	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int primo = 0;
		int indice = 0;
		int cont = 101;
		
		for( int i = 100 ; i < cont ; i++){
			
			primo = i ; 
			
			if(indice == 10){
				
				for( int j = 0 ; j < vetorA.length ; j++){
					System.out.print(vetorA[j] + " ");
				}
				break;
			}else{
				
				for( ; primo > 0 ; primo--){
					
					if( i % primo == 0 && i != primo || i == 1){
						cont++;
						break;
					}else if(primo == 2 ){
						vetorA[indice] = i;
						indice++;
						cont++;
						break;
					}
					
				}
				
			}
			
		}
		
		
		
		
		
	}
}
