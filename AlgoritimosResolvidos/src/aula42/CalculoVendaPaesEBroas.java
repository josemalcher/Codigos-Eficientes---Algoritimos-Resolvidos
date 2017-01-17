package aula42;

import javax.swing.JOptionPane;

/*
 * Uma padaria vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia;
 * Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono que saber quanto
 * arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança
 * (10% do total arrecadado). Você foi contratado para fazer os cálculos para o dono.
 * Com base nestes fatos, faça um algoritmo, para ler as quantidades de pães e broas e depois
 * calcula os dados solicitados.
 */
public class CalculoVendaPaesEBroas {
	public static void main(String[] args) {
		int pao  = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pão"));
		int broa = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Broa"));
		
		float total = ( 0.12f * pao ) + (1.50f * broa);
		float poupanca = total - (total * 0.90f);
		
		System.out.printf("O tatal arrecadado R$%.2f , devendo ser guardado R$%.2f",total, poupanca);
	}
}
