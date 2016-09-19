package aula03;

import java.util.Scanner;

/*
 * Escrever um algoritimo que Lê um valor 
 * em reais(R$) e calcula qual o menor 
 * numero possivel de notas 
 * de 100, 50, 10, 5 e 1 em que o valor 
 * lido pode ser decomposto. 
 * Escrever o valor e a relação de notas 
 * necessárias 
 */
public class CalculoMenorNumeroPossivel {

	public static void main(String[] args) {
		
		int valor = 0,
			cem = 0,
			cinquenta = 0,
			dez = 0,
			cinco = 0,
			um = 0 ;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor R$ ");
		valor = leitor.nextInt();
		
		if(valor % 100 != 0){
			cem = valor / 100;
			cinquenta = valor % 100;
			if(cinquenta % 50 != 0){
				dez = cinquenta % 50;
				cinquenta = cinquenta / 50;
				if(dez % 10 != 0){
					cinco = dez % 10;
					dez = dez / 10 ;
					if(cinco % 5 != 0){
						um = cinco % 5;
						cinco = cinco / 5;
					}else{
						cinco = cinco / 5;
					}
				}else{
					dez = dez / 10;
				}
			}else{
				cinquenta = cinquenta / 50;
			}
			
		}else{
			cem = valor / 100;
		}
		
		System.out.format("R$ 100 = %d \n"
						 + "R$ 50 = %d \n"
						 + "R$ 10 = %d \n"
						 + "R$ 5 = %d \n"
						 + "R$ 1 = %d \n",
						 cem, cinquenta,dez,cinco,um);

	}

}
