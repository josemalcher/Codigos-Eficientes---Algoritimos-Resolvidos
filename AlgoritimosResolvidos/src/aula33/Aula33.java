package aula33;

import java.util.Arrays;

import javax.swing.JOptionPane;

//Crie um programa que leia 5 paavras, de no máximo 15 caracteres, e depois imprima-as em ordem alfabética(crescente)
public class Aula33 {

	public static void main(String[] args) {
		
		String[] palavras = new String[5];
		int indice = 0;
		
		while(indice < 5){
			palavras[indice] = JOptionPane.showInputDialog("Digite uma palavra de até 15 caracteres\n "+"Palavra "+ (indice + 1)+" de 5 palavras");
			if(palavras[indice].length() > 15){
				String mensagemErro = "A palavra de ter até 15 caracteres ou menos!!";
				JOptionPane.showMessageDialog(null,mensagemErro,"Atenção",0 );
			}else{
				indice++;
			}
		}
		Arrays.sort(palavras);
		for (int i=0 ; i < palavras.length ; i++) {
			System.out.println((i+1) + " Palavra " + palavras[i]);
		}

	}

}
