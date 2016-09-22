package aula09;

import javax.swing.JOptionPane;

/*
 * Crie um progama que leia um numero que sera o 
 * limite superior d eumintervalo. Inprimir todos os 
 * numeros impares menores que esse numero
 */
public class Aula09 {
	public static void main(String[] args) {
		int valor = 0;
		String resultado = "";
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		
		for(int i = 0 ; i < valor ; i++){
			if( i % 2 != 0){
				resultado += i + " ";
			}
		}
		JOptionPane.showMessageDialog(null, resultado);
		
	}
}
