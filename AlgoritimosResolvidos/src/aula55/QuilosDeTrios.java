package aula55;

import javax.swing.JOptionPane;

/*
 * Códigos Eficientes
 * https://www.youtube.com/watch?v=3FunaX8mBL0
 * 
 * Questão:
 * A lanchonete Kilanche vende apenas um tipo de sanduíche, cujo o recherio inclui duas fatias de 
 * queijo, uma fatia de preseunto e uma rodela de hambúrgue.
 * Sabendo que cada fatia de queijo ou preseunto pesa 50 gramas, e que a rodela de hambúgue pesa 100 gramas,
 * faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, e a maquina
 * informe as quantidades (em quilos) de queijo e presunto e carne necessários
 * para compra.
 * 
 * 
 */
public class QuilosDeTrios {

	public static void main(String[] args) {

		int quantidade = Integer.parseInt( JOptionPane.showInputDialog("Digite a quantidade de sanduiches a fazer"));
		double queijo    = quantidade * (0.050 * 2);
		double presunto  = quantidade * 0.050;
		double hamburger = quantidade * 0.100;
		
		JOptionPane.showMessageDialog(null, String.format("Serão necessários \n"
														+ "%.3f Kg de queijo \n"
														+ "%.3f Kg de presunto \n"
														+ "%.3f Kg de hamburger	", queijo,presunto,hamburger));

	}

}
