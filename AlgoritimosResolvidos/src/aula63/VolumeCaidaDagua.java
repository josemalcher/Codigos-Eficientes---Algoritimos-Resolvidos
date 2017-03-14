package aula63;

import javax.swing.JOptionPane;

/*
 * Códogos eficientes
 * Algoritmos Resolvidos [ Matemática ] - Volume de caixa d'água
 * https://www.youtube.com/watch?v=ts1aWhklzkA
 * 
 * Calcule o volume de uma caixa d'água cilindrica.
 * 
 * 
 */
public class VolumeCaidaDagua {

	public static void main(String[] args) {
		
		double raio = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o raio da caixa d'água"));
		
		double altura = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a altura da caixa d'água"));
		
		double volume = Math.PI * Math.pow(raio, 2) * altura;
		
		JOptionPane.showMessageDialog(null, 
				String.format("O volume da caida d'água é %.2f litros", volume));
		
		

	}

}
