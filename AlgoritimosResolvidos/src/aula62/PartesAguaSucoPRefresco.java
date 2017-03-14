package aula62;

import javax.swing.JOptionPane;

/*
 * Códigos Eficientes
 * Algoritmos Resolvidos [ Matemática ] - Partes de água e suco para refresco
 * https://www.youtube.com/watch?v=7nDd2keHBi4
 * 
 * Um tonel de refresco é feito com 8 partes de água e 2 partes de suco de maracujá.
 * Faça um algoritmo para calcular quantos litros de água e de suco são necessários
 * para se fazer X litros de refresco (informados pelo usuário)
 * 
 */
public class PartesAguaSucoPRefresco {

	public static void main(String[] args) {
		
		double litros = Double.parseDouble(
				JOptionPane.showInputDialog("Digite quantos litros de refresco serão feitos")) ;
		
		
		double partes = litros / 10;
		
		double agua = partes * 8 ;
		double suco = partes * 2;
		
		JOptionPane.showMessageDialog(null, String.format("Serão necessários %.2f litros de agua e \n "
														+ "%.2f litros de suco para fazer \n"
														+ "%.2f litros de refresco.", agua, suco, agua + suco));
		

	}

}
