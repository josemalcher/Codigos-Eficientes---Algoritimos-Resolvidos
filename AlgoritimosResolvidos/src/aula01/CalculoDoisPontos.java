package aula01;

import java.util.Scanner;

public class CalculoDoisPontos {

	static double px1, py1, px2,py2, distancia;
	static Scanner leitor = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Defina os primeiros pontos");
		px1 = leitor.nextDouble();
		py1 = leitor.nextDouble();
		
		System.out.println("Defina os segundos pontos");
		px2 = leitor.nextDouble();
		py2 = leitor.nextDouble();
		
		distancia = Math.sqrt(Math.pow(px2-px1, 2) + Math.pow(py2 - py1, 2) );
		
		System.out.printf("A disTância é %.2f ", distancia);

	}

}
