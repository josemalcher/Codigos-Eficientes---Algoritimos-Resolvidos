package aula13;

/*
 * 
 * Faça um algoritmo que faça a união de dois
 * vetores de  mesmo tamanho e mesmo tipo em um terceiro
 * vetor com o dobro do tamanho.
 * 
 * 
 */
public class Aula13 {
	public static void main(String[] args) {
		String[] frutas = {"banana", "maçã", "Pêra"};
		String[] adicionais = {"Açucar", "mel", "leite"};
		String[] salada = new String[frutas.length + adicionais.length];
		
		
		for(int i = 0, j = 0; i < salada.length ; i+=2 , j++){
			System.out.print(salada[i] = frutas[j]);
			System.out.print( " " );
			System.out.print(salada[i + 1] = adicionais[ j ]);
			System.out.print(" ");
		}
		
		
		
		
		
	}
}
