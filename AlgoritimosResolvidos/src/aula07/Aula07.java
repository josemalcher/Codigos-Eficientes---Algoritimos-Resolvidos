package aula07;

import javax.swing.JOptionPane;

public class Aula07 {
	/*
	 * Faça um algoritmo que leia varios numeros inteiros e calcule o somatório
	 * dos numeros negativos o fim da leitura sera indicado pelo numero 0
	 */
	public static void main(String[] args) {
		int n = 1;
		int somatorio = 0 ;
		
		while(n != 0){
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite valores negativos para somar"));
			
			if(n < 0){
				somatorio += n;
			}
		}
		JOptionPane.showMessageDialog(null, "O somatorio dos nuemro negativos é " + somatorio);
	}

}
