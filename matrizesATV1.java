package LPA2;
import java.util.Scanner;
public class matrizesATV1 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in); 
     
		   int m [][] = new int [5][5];
		   int soma =0;
		   int numero = 1;
				   
	for (int i = 0; i <5; i++) {
		for (int j =0; j <5; j++) {
			numero = (int)Math.round(Math.random()* 50 + 1)* 2;
			m[i][j] = numero;
			soma += numero;
		}
	}
		   System.out.println("matriz com valores pares:");
		   for (int i = 0; i < 5; i++) {
			   for(int j = 0; j < 5; j++) {
				   System.out.print(m[i][j] + "\t");
			   }
			   System.out.println();
		   }
		   System.out.println("a soma dos valores da matriz: " + soma);
	}
}