package aula59;

import javax.swing.JOptionPane;

/*
 * Códigos Eficientes
 * Algoritmos Resolvidos [ Matemática ] - Litros de refrigerante comprados
 * https://www.youtube.com/watch?v=KNQgSZylv9M
 * 
 * Uma fábrica de refrigerentes vende seu produto em três formatos:
 * lata de 350ml, garraga de 600ml e garrafa de 2l.
 * Se um comerciante compra uma determna quantidade de
 * cada formato, faça um algoritmo para calcular quantos litros de 
 * refrigerante ele comprou.
 * 
 */

public class LitrosRefrigerante {

	public static void main(String[] args) {
		
		double[] litros = {0.350 , 0.600 , 2.000};
		
		int quantidade = 0;
		double total = 0;
		
		for (int i = 0; i < litros.length; i++) {
			quantidade = Integer.parseInt(
					JOptionPane.showInputDialog(
							String.format("Refrigerantes de %.3f ml comprados", litros[i])));
			total += (quantidade * litros[i]);
		}
		
		JOptionPane.showMessageDialog(null, String.format("O comerciante comprou %.3f ml de refrigerante", total));

	}

}
