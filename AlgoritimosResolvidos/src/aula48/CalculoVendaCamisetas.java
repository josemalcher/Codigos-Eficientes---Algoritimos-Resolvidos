package aula48;

import javax.swing.JOptionPane;

/*
 * Uma fabrica de camisetas produz os tamanhos pequeno, medio e grande, cada uma sendo vendida
 *  respectivamente por 10, 12, 15 reais. 
 *  Construa um algoritmo em que o usuario forneça a quantidade de camisetas
 *  pequenas medias e grandes referentes a uma venda, e a maquina informe
 *  quanto será o valor arrecadado.
 *  
 */
public class CalculoVendaCamisetas {

	public static void main(String[] args) {
		
		double[] valor = {10, 12, 15};
		String[] tamanho = {"pequena", "media","grande"};
		
		int quantidade = 0;
		double total = 0;
		
		for (int i = 0; i < tamanho.length; i++) {
			
			quantidade = Integer.parseInt(JOptionPane.showInputDialog(String.format("Digite a quantidade de camisetas %s", tamanho[i] ) ) );
			total += quantidade * valor[i];
			
		}
		JOptionPane.showMessageDialog(null, String.format("O valor arrecadado é de R$%.2f ", total));
		

	}

}
