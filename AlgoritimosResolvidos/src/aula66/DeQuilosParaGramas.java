package aula66;

import javax.swing.JOptionPane;

/*
 * Códigos Eficientes
 * Algoritmos Resolvidos [ Matemática ] - Quilos convertidos em gramas
 * https://www.youtube.com/watch?v=Wx_DD_LvuUs
 * 
 * Faça um algoritmo que receba o peso de uma pessoa em Kg, 
 * calcule e mostre o peso em gramas.
 * 
 */
public class DeQuilosParaGramas {

	public static void main(String[] args) {

		double peso = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o peso da pessoa"));
		
		JOptionPane.showMessageDialog(null, String.format("A pessoa pesa %.0f gramas",peso * 100 ));

	}

}
