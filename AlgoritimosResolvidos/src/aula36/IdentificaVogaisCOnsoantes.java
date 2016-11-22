package aula36;

import javax.swing.JOptionPane;

/*
 * 
 * Escreva um programa que receba uma string de até 20 caracteres
 * e imprime a string digitada, um vetor contendo as cinco primeiras 
 * vogais da string digitada e um vetor contendo as cindo últimas
 * consoantes da string digitada. Observe que para resolver este problema,
 * o seu programa deverá ter uma função para identificar se um caractere é vogal ou não.
 * 
 * 
 */

public class IdentificaVogaisCOnsoantes {

	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Digite uma palavra de até 20 caracteres");
		
		selecionaLetras(palavra);
		

	}

	private static void selecionaLetras(String palavra) {
		
		if(palavra.length() <= 20){
			System.out.print(palavra);
			char[] vogais = {'a','e','i','o','u'};
			char[] priVogais = new char[vogais.length];
			char[] ultVogais = new char[vogais.length];
			
			int cont = 0;
			
			for (int i = 0; i < palavra.length(); i++) {
				for (int j = 0; j < vogais.length; j++) {
					if(Character.toLowerCase(palavra.charAt(i)) == vogais[j] && cont < 5){
						priVogais[cont] = palavra.charAt(i);
						if(cont == 0){
							System.out.print("Cinco primeiras vogais: " + priVogais[cont]+ " ");
						}else{
							System.out.print(priVogais[cont] + " ");
						}
						cont++;
					}
				}
			}
			cont = 0 ;
			System.out.println();
			System.out.println("Cinco últimas consoantes: ");
			for (int i = palavra.length() -1 ; i >=0 ; i--) {
				if(cont < 5){
					switch(palavra.charAt(i)){
					case 'a':
						break;
					case 'e':
						break;
					case 'i':
						break;
					case 'o':
						break;
					case 'u':
						break;
					default:
						ultVogais[cont] = palavra.charAt(i);
						System.out.print(ultVogais[cont]+ " ");
						cont++;
						break;
					}
					
				}
			}
			
		}else{
			System.out.println("A palavra tem mais que 20 Caracteres");
		}
		
		
		
	}

}
