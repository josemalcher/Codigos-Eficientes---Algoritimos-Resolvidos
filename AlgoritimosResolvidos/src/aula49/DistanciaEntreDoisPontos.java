package aula49;

import javax.swing.JOptionPane;

/*
 * 
 * Construa um algoritimo para calcular a distância
 * entre dois pontos do plano cartesiano.
 * Cada ponto é um par ordenado (x,y)
 * 
 */
public class DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		
		double[] pontos = new double[4];
		String[] coords = {"x1","x2","y1","h2"};
		double distancia= 0;
		
		for (int i = 0; i < coords.length; i++) {
			pontos[i] = Double.parseDouble(JOptionPane.showInputDialog(String.format("Digite a coordenada %s", coords[i])));
		}
		
		distancia = Math.sqrt(Math.pow(pontos[1] - pontos[0],2) + Math.pow(pontos[3] - pontos[2],2) );
		JOptionPane.showMessageDialog(null, String.format("A distância entre os dois pontos é %.4f", distancia));
		
		
		

	}

}
