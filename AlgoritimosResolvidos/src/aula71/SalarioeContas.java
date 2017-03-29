package aula71;

import javax.swing.JOptionPane;

/*
 * Códigos Eficientes
 * Algoritmos Resolvidos [ Matemática ] - Salário e contas atrasadas
 * https://www.youtube.com/watch?v=IgWWGiZ_IW8
 * 
 * Marcos recebeu seu salário de R$ 1200,00 e precisa pagar duas contas
 * c1 = R$ 200,00 e c2 = R$ 120,00) que estão atrasadas. Como as contas estão
 * atrasadas, Marcos terá de pagar multa de 2% sobre cada conta.
 * Faça um algoritmo que calcule e mostre quanto restará do salário do Marcos.
 * 
 */
public class SalarioeContas {

	public static void main(String[] args) {
		
		double total = 1200 - ( (200 +(200 * 0.02)) + (120 + (120 * 0.02)) ); 
		JOptionPane.showMessageDialog(null, String.format("Do salário de Marcos restará R$%.2f", total));
		

	}

}
