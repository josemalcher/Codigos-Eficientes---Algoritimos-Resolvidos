package aula57;

import javax.swing.JOptionPane;

/*
 * Códigos Eficientes
 * Algoritmos Resolvidos [ Matemática ] - Despesas de granja com frangos
 * https://www.youtube.com/watch?v=hqppmD-76r0
 * 
 * Questão:
 * A granje Frangus possui um controle automatizado de cada frango da sua produção.
 * No pé direito do frango há um anem com um chip de identificação; no pé esquerdo são 
 * dois aneis para indicar o tipo de alimente que ele deve consumir.
 * Sabendo que o anel com chipe custa R$ 4,00 e o anel de alimento custa R$ 3,50,
 * faça um algoritmo para calcula o gasto total de granja para marcar todos os frangos.
 * 
 * 
 * 
 */
public class DespesasGranjaFrangos {

	public static void main(String[] args) {
		
		int quantidadeFrangos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de frangos"));
		
		double total = (quantidadeFrangos * 4.00 ) + ((quantidadeFrangos * 3.50) * 2);
		
		JOptionPane.showMessageDialog(null, String.format("o total gasto com os %d frangos são R$ %.2f reais", quantidadeFrangos,total));

	}

}
