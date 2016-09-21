package aula05;

import javax.swing.JOptionPane;

public class Aula05 {

	public static void main(String[] args) {
		
		float alturaPedro = 1.50f;
		float alturaManoel = 1.10f;
		int anos = 0;
		
		while(alturaPedro > alturaManoel){
			alturaPedro += .02;
			alturaManoel += .03;
			anos++;
		}
		
		JOptionPane.showMessageDialog(null, "Manoel sera maior que o pedro após " + anos +" anos");

	}

}
