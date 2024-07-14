
public class Aula4 {

	public static void main(String[] args) {
		int[][] matriz;
		matriz = new int[2][3];
		
		matriz[0][0] = 5;
		matriz[0][1] = 15;
		matriz[0][2] = 20;
		matriz[1][0] = 25;
		matriz[1][1] = 30;
		matriz[1][2] = 35;
		
//		for(int i = 0; i<matriz.length; i++) 
//			for(int j=0; j<matriz[i].length;j++)
//			{
//				System.out.println("Valor na posição  ["+i+"]["+j+"]:" + matriz[i][j]);
//			}
		int [][] matriz2 = {{2,3,4}, {5,6,7}, {8,9,10}};
		
		for(int i = 0; i<matriz2.length; i++)
		{ 
			System.out.println("\n");
			for(int j=0; j<matriz2[i].length;j++)
				System.out.print(matriz2[i][j] + "\t");
		}
		
		System.out.println("\n");
		double a=10.39393, b = 20.69332;
		System.out.printf("Imprimir %.2f - %.2f",a,b);
				
	}

}
