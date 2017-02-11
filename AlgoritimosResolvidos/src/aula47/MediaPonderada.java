package aula47;

import javax.swing.JOptionPane;

/*
 * 
 * Faça um algoritmo para ler três notas de um alino em uma disciplina e
 * imprimir a sua média ponderada (as notas tem pesos respectivos 1,2 e 3)
 * 
 */
public class MediaPonderada {

	public static void main(String[] args) {
		
		double[] nota = new double[3];
		double total = 0;
		
		for(int i = 0 ; i < nota.length ; i++){
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog(String.format("Digite a %dª nota do aluno", i + 1)));
		}
		
		total = (((nota[0]*1)+(nota[1]*2)+(nota[2]*3)) / (1+ 2+ 3));
		
		JOptionPane.showMessageDialog(null, String.format("A média ponderada do aluno é %.2f ", total));

	}

}
