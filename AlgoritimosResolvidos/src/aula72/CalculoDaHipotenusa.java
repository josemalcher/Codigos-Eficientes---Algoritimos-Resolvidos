package aula72;

import javax.swing.JOptionPane;

/*
 * Algoritmos Resolvidos [ Matemática ] - Cálculo da hipotenusa
 * https://www.youtube.com/watch?v=p2M-eg7dSqQ
 * 
 * Faça um algoritmo que receba o valor dos catetos de um triangulo,
 * calcule e mostre o valor da hipotenusa.
 * 
 */
public class CalculoDaHipotenusa {

	public static void main(String[] args) {

		
		int catUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro cateto"));
		int catDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo cateto"));
		
		double hipotenusa = Math.sqrt(Math.pow(catUm, 2) + Math.pow(catDois, 2) );
		
		JOptionPane.showMessageDialog(null, String.format("O valor da Hipotenusa é %.2f", hipotenusa));
		
		

	}

}
