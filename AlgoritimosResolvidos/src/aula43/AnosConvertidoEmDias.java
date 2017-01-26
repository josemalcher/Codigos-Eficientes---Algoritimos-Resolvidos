package aula43;

import javax.swing.JOptionPane;

/*
 * Escreva um algoritmo para ler o nome e a idade da pessoa, 
 * e exivir quandos dias de vida ela possui.
 * Considere sempre anos completos, e que um ano possui 365 dias.
 * Ex.: uma pessoa com 19 anos possuir 6935 dias;
 * Veha um exemplo de saída?
 * "PEDRO, voce já viveu 6935 dias"
 * 
 * https://www.youtube.com/watch?v=21mWVwmNP6s
 * 
 */
public class AnosConvertidoEmDias {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		System.out.printf("%s, voce já viveu %d dias",nome, idade * 365);
	}
}
