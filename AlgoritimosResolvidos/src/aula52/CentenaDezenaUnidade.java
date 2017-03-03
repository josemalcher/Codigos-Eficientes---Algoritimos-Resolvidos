package aula52;

import javax.swing.JOptionPane;

/*
 * Ler um número inteiro (assuma até três digitos) e imprima a saída da seguinte forma:
 * 
 * CENTENA = x
 * DEZENA  = x
 * UNIDADE = x
 * 
 */
public class CentenaDezenaUnidade {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número com até 3 digitos"));
		
		int centena = numero / 100;
		int dezena  = (numero % 100) / 10 ;
		int unidade = (numero % 100) % 10 ;
		
		JOptionPane.showMessageDialog(null, String.format("CENTENA: %d \n"
										+   "DEZENA %d \n"
										+   "UNIDADE %d", centena,dezena,unidade));	

	}

}
