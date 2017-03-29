package aula70;

import javax.swing.JOptionPane;

/*
 * Códigos Eficientes
 * 
 * 
 * 
 * Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual,
 * calcule e mostre:
 * a) a idade dessa pessoa em anos;
 * b) a idade dessa pessoa em meses;
 * c) a idade dessa pessoa em dias;
 * d) a idade dessa pessoa em semanas.
 * 
 */
public class IdadeDiversasFormas {

	public static void main(String[] args) {
		
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
		
		int anos = anoAtual - anoNascimento;
		int meses = anos * 12;
		int dias = anos * 365;
		int semanas = anos * 52;
		
		JOptionPane.showMessageDialog(null, String.format("Anos: %d\n Meses: %d\n Dias %d\n Semanas %d", anos,meses,dias,semanas));

	}

}
