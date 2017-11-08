package algomod2;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[][] = new int [2][2];
        int B[][] = new int [2][2];
        
        System.out.println("Masukkan Matrix A :");
        for( int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print("Elemen Matrix A Baris ke " +(i+1)+ "kolom ke " +(j+1)+ ": ");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println();
        
        System.out.println("Tampikan Matrix A : ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }  
        
        B[0][0] = A[0][0]*A[0][0] + A[0][1]*A[1][0];
        B[0][1] = A[0][0]*A[0][1] + A[0][1]*A[1][1];
        B[1][0] = A[1][0]*A[0][0] + A[1][1]*A[1][0];
        B[1][1] = A[1][0]*A[0][1] + A[1][1]*A[1][1];
        
        System.out.println();
        
        System.out.println("Hasil Matrix = ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(B[i][j]+ " ");
            }
            System.out.println("");
        }
    }  
}
