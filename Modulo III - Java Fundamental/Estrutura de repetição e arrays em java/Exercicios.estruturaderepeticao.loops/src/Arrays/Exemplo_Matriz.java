package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Exemplo_Matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int [][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j] = random.nextInt(9);
            }
        }
        for (int[] linha: matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " | ");
            }
            System.out.println();
        }
    }
}
