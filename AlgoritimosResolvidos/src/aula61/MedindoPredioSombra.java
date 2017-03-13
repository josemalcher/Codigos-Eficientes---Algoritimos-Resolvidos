package aula61;

import javax.swing.JOptionPane;

/*
 * Códigos Eficientes
 * 
 * Algoritmos Resolvidos [ Matemática ] - Medindo prédio, usando sombras
 * https://www.youtube.com/watch?v=oVweEziLEk8
 * 
 * Num dia de sol, voce deseja media a altura de um prédio, porém, a trena não é suficiente longa.
 * Assumindo que seja possível medir sua sombra e a do prédio no chão, e que voce lembre
 * da sua altura, faça um algoritmo para ler os dados necessários e calcula a altura do prédio.
 */
public class MedindoPredioSombra {

	public static void main(String[] args) {
		
		final double minhaAltura = 1.00;
		double minhaSombra = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da sua sombra"));
		double PredioSombra = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da Sombra do PREDIO"));
		
		double alturaPredio = (PredioSombra / minhaSombra) * minhaAltura;
		
		JOptionPane.showMessageDialog(null, String.format("O prédio mede %.2f metros de altura", alturaPredio));

	}

}
