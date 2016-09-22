package aula10;
/*
 *  Desenhar um triangulo no console
 * 
 * 
 */

import javax.swing.JOptionPane;

public class Aula10 {
	public static void main(String[] args) {
		String crescente = "";
		int descrescente = 1;

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));

		for (int i = 1; i <= valor; i++) {
			crescente += "* ";
			System.out.println(crescente);
		}

		for (int j = valor; j > 0; j--) {
			while (descrescente < j) {
				System.out.print("* ");
				descrescente++;
			}
			System.out.println();
			descrescente = 1;

		}

	}
}
