package aula41;

import javax.swing.JOptionPane;

/*
 * 
 * Faça um algoritmo para calcula quantas ferraduras são 
 * necessárias para equipar todos os cavalos comprados de um haras.
 * 
 */
public class CalculoFerraduras {

	public static void main(String[] args) {
		
		int numCavalos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cavalos no haras"));
		System.out.printf("Serão necessárias %d ferraduras para equipar %d cavalos do haras", numCavalos * 4, numCavalos);
		

	}

}
