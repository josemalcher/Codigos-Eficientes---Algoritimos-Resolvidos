package aula51;

import javax.swing.JOptionPane;

/*
 * Faça um algoritmo para ler o salario de um funcionário e aumentá-lo em 15%. 
 * Após o aumento, desconte 8% de impostos.
 * Imprima o salário inicial, o salário com o aumenta e o salário final.
 * 
 */
public class SalarioAumentaSubtraiImpostos {

	public static void main(String[] args) {
	
		double salario = Double.parseDouble( JOptionPane.showInputDialog("Digite o salario do funcionário"));
		double salarioAumentado = salario + (salario * 0.15);
		double salarioFinal = salarioAumentado - (salario * 0.08);
		
		JOptionPane.showMessageDialog(null, String.format("Salário inicial: %.2f\n "
														+ "Salário com aumento %.2f\n"
														+ "Salário final %.2f", 
														salario,salarioAumentado,salarioFinal));
		

	}

}
