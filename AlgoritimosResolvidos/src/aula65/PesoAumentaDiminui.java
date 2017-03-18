package aula65;

import javax.swing.JOptionPane;

/*
 * Códigos Eficientes
 * Algoritmos Resolvidos [ Matemática ] - Peso se engordar ou emagrecer
 * https://www.youtube.com/watch?v=GIRiDA7b70I
 * 
 * Faça um algoritmo que receba o peso de uma pessoa, calcule e mostre:
 * a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
 * b) o nome peso se a pessoa emagrecer 20% sobre o peso digitado.
 */
public class PesoAumentaDiminui {

	public static void main(String[] args) {

		double peso = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o peso da pessoa"));
		
		JOptionPane.showMessageDialog(null, String.format(
				"Peso  ao engordar 15%%: %.2f Kg \n"
				+ "Peso ao emagrecer 20%% %.2f Kg ", 
				peso + (peso * 0.15), peso - (peso * 0.20)));

	}

}
