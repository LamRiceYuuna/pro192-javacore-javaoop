package inputmatrix;

import java.util.Scanner;

public class Inputmatrix {

    public static void main(String[] args) {
        System.out.println("Input Matrix Program!!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Number Of Rows: ");
        int a = sc.nextInt();
        System.out.print("Please Enter Number Of Columns: ");
        int b = sc.nextInt();
        System.out.print("");
        System.out.println("Now,enter elements of matrix: ");

        double[][] arr = new double[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("matrix[" + (i + 1) + "][" + (j + 1) + "] = ");
                while (true) {
                    try {
                        arr[i][j] = sc.nextDouble();

                    } catch (Exception e) {
                        System.out.println("You Must Enter Number ");
                        break;
                    }

                }
            }
        }

        System.out.println("-----------------");
        System.out.println("Your Matrix Is: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + "  ");

            }
            System.out.println("");

        }
        System.out.println("You Are Anesome! Excellent!");

    }

}
