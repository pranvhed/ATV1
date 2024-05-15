package LPA2;
import java.util.Scanner;
public class MATRIZESATV2 {

	public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];  
        for (int i = 0; i < 4; i++) {
            matriz[i][i] = i + 1; 
        }

        System.out.println("Matriz 4x4 com valores na diagonal principal:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

 