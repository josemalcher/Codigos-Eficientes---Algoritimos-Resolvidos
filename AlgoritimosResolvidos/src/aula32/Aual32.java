package aula32;

import javax.swing.JOptionPane;

/*
 * Faça um algorítimo que receba 2 númeos e divida o intervalo entre eles
 * em 3 partes iguais.
 * Obs.: Faça a consiência para que os extremos não sejam iguais.
 */
public class Aual32 {

	public static void main(String[] args) {

		double valorUm = 0;
		double valorDois = 0;
		double[] resultado = new double[3];

		valorUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		valorDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo valor: "));

		if (valorUm != valorDois) {
			if (valorUm > valorDois) {
				for (int i = 0; i < resultado.length; i++) {
					resultado[i] = (valorUm - valorDois) / 3;
				}
			} else {
				for (int i = 0; i < resultado.length; i++) {
					resultado[i] = (valorDois - valorUm) / 3;
				}
			}
			for (int i = 0; i < resultado.length; i++) {
				System.out.printf("Parte %d = %.2f ",+ i+1, resultado[i]);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Os valores devem ser diferentes!!");
		}

	}

}
