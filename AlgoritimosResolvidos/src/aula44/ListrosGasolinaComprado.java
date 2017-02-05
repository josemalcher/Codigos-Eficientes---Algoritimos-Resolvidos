package aula44;

import javax.swing.JOptionPane;

/*
 * Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um 
 * algoritmo para ler o preço do litro de gasolina e o valor do pagamento,
 * e exibir quantos litros ele conseguiu colocar no tanque.
 */

public class ListrosGasolinaComprado {

	public static void main(String[] args) {

		double preco     = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do litro de gasolina",3.0));
		double pagamento = Double.parseDouble(JOptionPane.showInputDialog("Digite quanto foi pago",30.00));
		double x = pagamento/preco;
		
		JOptionPane.showMessageDialog(null, String.format("Foi colocado no tanque o total de %.2f de litros de gasolina",x));

	}

}
