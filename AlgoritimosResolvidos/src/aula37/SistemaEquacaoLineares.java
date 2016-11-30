package aula37;
//https://www.youtube.com/watch?v=fSup8R5UHDg
//Um sistema de equações lineares do tipo:
// ax + bx = c
// dx + ey = f, pode ser resolvido segundo mostrado abaixo:

import javax.swing.JOptionPane;

// x = ce - bf   y = af - cd
//    ________       ________
//	   ae - bd		  ae - bd

//escreva um algoritmo que lê os corficientes a,b,c,d,e e f e calcula e mostra os valores de x e y 

public class SistemaEquacaoLineares {

	public static void main(String[] args) {
		
		String[] coeficiente = {"a","b","c","d","e","f"};
		double[] coef = new double[coeficiente.length];
		for (int i = 0; i < coef.length; i++) {
			coef[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dos corficientes " + coeficiente[i]));
		}
		Coeficientes calculado = new Coeficientes(coef[0], coef[1], coef[2], coef[3], coef[4], coef[5]);
		calculado.Calcular();
 
	}

}

class Coeficientes{
	double a;
	double b;
	double c;
	double d;
	double e;
	double f;
	public Coeficientes(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public void Calcular(){
		double x,y;
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d);
		
		System.out.printf("Valor de x = %2f\nValor de y = %2f",x,y);
	}
	
}