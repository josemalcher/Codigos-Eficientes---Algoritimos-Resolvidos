package aula06;

import javax.swing.JOptionPane;

public class Aula06 {
	/*
	 * construir um algoritimo que calcule a média aritimetica de vários valores
	 * interiors positivos, lidos externamente. o final da leitura acontecerá
	 * quando for lido um valor negativo
	 */
	public static void main(String[] args) {
		double valor = 0;
		double media = 0;
		int cont = 0;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor. Para sair digite '-1'"));
		
		while(valor >= 0){
			media += valor;
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor. Para sair digite '-1'"));
			cont++;
		}
		JOptionPane.showMessageDialog(null, "A média dos valores lidos é :" + (media/cont));
	}

}
