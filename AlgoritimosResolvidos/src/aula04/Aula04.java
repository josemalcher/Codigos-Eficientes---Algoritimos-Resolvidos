package aula04;

import javax.swing.JOptionPane;

public class Aula04 {

	public static void main(String[] args) {
		
		int codigo = 0;
		int quantidade = 0;
		double valor = 0;
		double total = 0;
		
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto"));
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada"));
		
		if(codigo == 100 || codigo == 103){
			valor = 1.20;
		}
		if(codigo == 101 || codigo == 104){
			valor = 1.30;
		}
		if(codigo == 102){
			valor = 1.50;
		}
		if(codigo == 105){
			valor = 1.00;
		}
		total = valor * quantidade;
		
		JOptionPane.showMessageDialog(null, "O total a pagar é R$"+total);
		

	}

}
