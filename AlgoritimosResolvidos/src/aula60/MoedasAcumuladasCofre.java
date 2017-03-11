package aula60;

import javax.swing.JOptionPane;

/*
 * Códigos Eficientes
 * https://www.youtube.com/watch?v=pphAqoTMHaE
 * Algoritmos Resolvidos [ Matemática ] - Moedas acumuladas em cofre
 * 
 * Marcelo tem um cofre com muitas moedas, e deseja saber quantos reais
 * conseguiu poupar.
 * Faça um algoritmo para ler a quantidade de cada tipo de moeda, 
 * e imprimir o calor total economizado, em reais.
 * Considere que existam moedas de 1, 5, 10, 25, 50 centavos e a moeda de 1 real.
 * Não havendo moeda de um tipo, a quantidade é zero.
 * 
 */
public class MoedasAcumuladasCofre {

	public static void main(String[] args) {
		
		double[] moedas = {0.01, 0.05, 0.10, 0.25, 0.50, 1.00};
		
		int quantidade = 0;
		double total = 0;
		
		for (int i = 0; i < moedas.length; i++) {
			if(moedas[i] < 1.00){
				quantidade = Integer.parseInt(JOptionPane.showInputDialog(String.format("Digite a quantidade de moedade de %.2f centavos ", moedas[i])));
			}else{
				quantidade = Integer.parseInt(JOptionPane.showInputDialog(String.format("Digite a quantidade de moedade de %.2f reais ", moedas[i])));
			}
			total += quantidade * moedas[i];
		}
		
		JOptionPane.showMessageDialog(null, String.format("O valor total economizado é %.2f", total));

	}

}
