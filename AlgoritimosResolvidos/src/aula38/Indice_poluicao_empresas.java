package aula38;

import javax.swing.JOptionPane;

/*
 * O departamento que controla o índice de poluição do meio ambiente
 * mantém 3 grupos de industrias que são altamente poluentes do meio
 * ambiente. O ídice de polução aceitável caria de 0.05 ate 0,25.
 * Se o índice sobe para 0.3 as indústrias do 1º grupo são intimadas
 * a supenderem as atividades, se o índice cresce para 0,4 as do 1º e 2º
 * grupo são intimadas a suspenderem duas atividades e se o indice atigir
 * 0,5 todos os 3 grupos devem ser notificadas a paralisarem
 * suas atividades. Escrever um algoritmo que lê o índice de poluição médio
 * e emite a notificação aos diferentes grupos de empresas.
 * 
 * 
 */
public class Indice_poluicao_empresas {

	public static void main(String[] args) {
		
		double indicePoluicao = Double.parseDouble(JOptionPane.showInputDialog("Digite o índice da poluição atual"));
		
		if(indicePoluicao > 0){
			if(indicePoluicao >=0.5){
				System.out.println("Todos os 3 grupos intimados a suspederem as atividades");
			}else if(indicePoluicao >= 0.4){
				System.out.println("O 1 e 2 grupo estão intimados a suspenderem as atividades");
			}else if(indicePoluicao >= 0.3){
				System.out.println("O 1 grupo está intimado a suspender suas atividades");
			}else{
				System.out.println("Índice de poluição aceitavel para todos os grupos");
			}
		}else{
			System.out.println("índice de poluição inválido");
		}
		
		

	}

}
