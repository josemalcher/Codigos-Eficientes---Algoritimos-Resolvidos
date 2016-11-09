package aula34;
//Faça um método que receba, por parâmetro, uma matriz A(6,6) e multiplica cada linha
//pelo elemento da diagonal principal daquela linha. O procedimento deve retornar a matriz alterada.
//FONTE: https://www.youtube.com/watch?v=q8areL6x40E 
public class Aula43 {

	public static void main(String[] args) {
		
		int[][] A = {
				{ 7,2,3,4,5,6 },
				{ 6,5,4,3,2,1 },
				{ 4,2,6,1,3,5 },
				{ 5,4,9,8,2,7 },
				{ 9,4,5,8,1,3 },
				{ 7,9,2,3,6,4 },
		};
		
		multiDiagPrint(A);

	}

	private static void multiDiagPrint(int[][] matriz) {
		int diag = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if( i == j){
					diag = matriz[i][j];
				}
			}
			for (int k = 0; k < matriz.length; k++) {
				matriz[i][k] *= diag;
				
				if(matriz[i][k] < 10){
					System.out.print("0" + matriz[i][k] + " ");
				}else{
					System.out.print(matriz[i][k] + " ");
				}
			}
			System.out.println();
		}
	}

}
