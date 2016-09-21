package aula08;

import javax.swing.JOptionPane;

/*
 * Uma loja tem 3 clientes cadastrados e deseja mandar uma correspondencia a cada um deles anunciando um bonus especial.
 * Escreva um algoritimo que leia o nome do cliente e o valor das suas compras no ano passado e calculo o bonus de 10% se o valor das compras for menor que 5.000 e de 15%, caso contrário.
 */
public class Aula08 {

	
	static final int total = 3;
	
	public static void main(String[] args) {

		String[] nome = new String [total];
		double[] valorCompras = new double[total];
		double[] bonus = new double[total];
		
		for(int i = 0 ; i< total; i++){
			nome[i] =  JOptionPane.showInputDialog("Digite o nome do cliente");
			valorCompras[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das compras"));
			bonus[i] = valorCompras[i] < 5000 ? valorCompras[i] * 0.10f : valorCompras[i] * 0.15f;
		}
		
		for(int j = 0 ; j < 1 ; j++){
			JOptionPane.showMessageDialog(null, 
					String.format(
							"O cliente %s irá receber %.2f de bonus \n	O cliente %s irá receber %.2f de bonus \n O cliente %s irá receber %.2f de bonus \n",
							nome[j], bonus[j],
							nome[j+1], bonus[j+1],
							nome[j+2], bonus[j+2]));
		}
		
	}

}
