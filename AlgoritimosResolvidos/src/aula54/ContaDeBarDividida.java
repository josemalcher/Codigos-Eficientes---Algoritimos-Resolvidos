package aula54;

import javax.swing.JOptionPane;

/*
 * Códigos Eficientes -> https://www.youtube.com/watch?v=AppTuto5d7c
 * 
 * Exercício 54
 * 
 * Três amigos, Carlos, André e Felipe. Decidiram rachar igualmente a conta de um bar. Faça um
 * algoritmo para ler o valor total de uma conta e imprimir quanto cada um deve pagar,
 * mas faça com que Calas e André não paguem centavos. 
 * Ex.: Um conta de R$ 101,53
 * 
 */
public class ContaDeBarDividida {

	public static void main(String[] args) {

		double totalConta = Double.parseDouble(JOptionPane.showInputDialog("Digite o total a pagar"));
		
		double sobra = totalConta % 3;
		
		double valorCarlos = (totalConta - sobra) / 3 ;
		double valorAndre  = (totalConta - sobra) / 3 ;
		double valorFelipe = ((totalConta - sobra) / 3) + sobra;
		
		JOptionPane.showMessageDialog(null, String.format("Carlos paga R$ %.2f \n André paga R$ %.2f \n Felipe paga R$ %.2f", valorCarlos,valorCarlos,valorFelipe));

	}

}
