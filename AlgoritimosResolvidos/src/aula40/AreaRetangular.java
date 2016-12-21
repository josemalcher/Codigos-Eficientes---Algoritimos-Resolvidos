package aula40;

import javax.swing.JOptionPane;

/*
 * Uma imobiliarea vende apenas terrenos retangulares.
 * Faça um algoritmo para ler as dimensões de um terreno
 * e depois exibir sua área.
 */
public class AreaRetangular {

	public static void main(String[] args) {
		
		double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do terreno"));
		double profundidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a profundidade"));
		double area = largura * profundidade;
		
		System.out.printf("A áre é = %.2f m²",area);

	}

}
