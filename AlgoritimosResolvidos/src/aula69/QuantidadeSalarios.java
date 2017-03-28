package aula69;

import javax.swing.JOptionPane;

/*
 * Códigos Eficientes
 * Algoritmos Resolvidos [ Matemática ] - Quantidade de salários ganhos
 * https://www.youtube.com/watch?v=4gRIEQqMQ0I
 * 
 * Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um funcionário,
 * Calcule e mostre a quantidade de salários mínioms que ganha esse funcionário
 */
public class QuantidadeSalarios {

	public static void main(String[] args) {
		
		double salMinio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário minio"));
		double salFunfionario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario do funcionário"));
		
		double quantidade = salFunfionario / salMinio;
		double sobra = salFunfionario % salMinio;
		
		if(salFunfionario < salMinio){
			JOptionPane.showMessageDialog(null, "O Salario do funcionário não chega a 1 Salário Mínimo");
		}else if(sobra != 0){
			JOptionPane.showMessageDialog(null, String.format("O funcionário ganha %.0f salário(s) e R$%.2f reais", quantidade,sobra));
		}else{
			JOptionPane.showMessageDialog(null, String.format("O funcionário ganha %.0f salário(s)", quantidade));
		}

	}

}
