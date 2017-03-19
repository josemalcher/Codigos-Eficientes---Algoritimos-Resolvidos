package aula68;

import javax.swing.JOptionPane;

/*
 * Código Eficientes
 * Algoritmos Resolvidos [ Matemática ] - Cálculo da área do losango
 * https://www.youtube.com/watch?v=9X_O71V0osQ
 * 
 * Faça um algoritmo que calcule e mostre a área de um losango.
 * Sabe-se que: A = (DiagonalMaior * DiagonanalMenor) / 2
 * 
 */
public class AreaLosango {
	public static void main(String[] args) {
		
		double dMaior = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor da diagonal Maior do losango"));
		double dMenor = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor da diagonal Menor do losango"));
		
		double area = (dMaior * dMenor) /2;
		
		JOptionPane.showMessageDialog(null, 
				String.format("A área do losando é %.2f", area));
	}
}
