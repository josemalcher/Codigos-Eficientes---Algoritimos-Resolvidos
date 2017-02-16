package aula50;

import javax.swing.JOptionPane;

/*
 * Uma fábrica controla o tempo de trabalho sem acidentes pela quantidade
 * de dias. Faça um algoritmo para converter este tempo em anos, meses e dias.
 * Assuma que cada mês possui sempre 30 dias.
 * 
 * 
 */
public class DiasConvertidosAnosMesesDias {

	public static void main(String[] args) {
		
		int anos, meses, dias;
		int tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias sem acidentes."));
		anos = tempo/360;
		meses = (tempo - (360*anos)) / 30;
		dias = (tempo - (360 * anos)) % 30;
		
		JOptionPane.showMessageDialog(null, String.format("Faz %d ano(s), %d mes(es), %d dia(s) sem acidentes nessa fabrica", anos,meses, dias));
		

	}

}
