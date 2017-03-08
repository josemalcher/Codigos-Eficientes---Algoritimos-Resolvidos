package aula53;

import javax.swing.JOptionPane;

//Calcule a área de uma pizza que possui um raio
// R (pi = 3.14)
public class AreaPizza {
	public static void main(String[] args) {

		double raio = Double.parseDouble( JOptionPane.showInputDialog("Digite  o raio da pizza"));
		double area = Math.PI * Math.pow(raio, 2);
		
		JOptionPane.showMessageDialog(null, String.format("A área da pizza é %.2f ", area));
		
	}
}
