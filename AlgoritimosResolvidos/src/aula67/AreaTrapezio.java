package aula67;

import javax.swing.JOptionPane;

/*
 * Códigos Eficientes
 * Algoritmos Resolvidos [ Matemática ] - Cálculo da área do trapézio
 * https://www.youtube.com/watch?v=SbNRtJqlc1g
 * 
 * Faça um algoritmo que calcule a área de um trapézio.
 * Sabe-se que: A = ((base maior + base menor) * altura ) / 2;
 * 
 * 
 */
public class AreaTrapezio {

	public static void main(String[] args) {
		
		double baseMaior = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a base maior do trapézio"));
		double baseMenor = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a base menor do trapézio"));
		double altura = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a base Altura do trapézio"));
		
		double area = ((baseMaior + baseMenor)*altura) / 2;
		
		JOptionPane.showMessageDialog(null, String.format(
				"A área do trapézio é de %.2f", area));

	}

}
