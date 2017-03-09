package aula58;

import javax.swing.JOptionPane;

/*
 * Códigos Eficientes
 * Algoritmos Resolvidos [ Matemática ] - Novelos gastos em blusas
 * https://www.youtube.com/watch?v=JypfUN5IgAs
 * 
 * Questão:
 * Um confecção produz X blusas de lã e para isso gasta uma certa
 * quantiadde de novelos.
 * Faça um algoritmo para calcula quantos novelos de lã ela gasta
 * por blusa.
 * 
 */
public class NovelosGastosBlusas {

	public static void main(String[] args) {
		
		int blusas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de blusas produzidas"));
		
		double novelos = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de novelos gastos"));
		
		double total = novelos/blusas;
		
		JOptionPane.showMessageDialog(null, String.format("São gastos %.2f novelos em cada blusa", total));
		
		

	}

}
