package aula64;

import javax.swing.JOptionPane;

/*
 * Códigos Eficientes
 * Algoritmos Resolvidos [ Matemática ] - Salário de funcionário e comissão
 * https://www.youtube.com/watch?v=uDVaKbPgnAk
 * 
 * Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um
 * algoritmo que receba o salário fixo de um funcionário e o valor de suas vendas,
 * calcule e mostre a comissão e o salário final do funcionário.
 * 
 * 
 */
public class SalaarioEComissao {

	public static void main(String[] args) {
		
		double salario = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o salário do funcionário"));
		double vendas = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor de suas vendas"));
		
		double comissao = vendas * 0.04;
		
		JOptionPane.showMessageDialog(null, 
				String.format("A comissão do funcionario é de R$%.2f"
							+ "\n seu salário final é R$%.2f", comissao, salario+comissao));

	}

}
