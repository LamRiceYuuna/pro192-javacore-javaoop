
package bai1b1;

public class Bai1b1 {
    public static int sum_of_row(int [][] matrix, int row) {
        int sum_row = 0;
        for (int i = 0; i < 3 ; i++) {
            sum_row += matrix [row][i];
           
            
        }
        return sum_row;
    }
    public static int sum_of_column(int [][] matrix, int column) {
        int sum_column = 0;
        for (int i = 0; i < 2 ; i++) {
            sum_column += matrix [i][column];
           
            
        }
        return sum_column;
    }

    
    public static void main(String[] args) {
        int [][] matrix = {{1, 3, 4},
                           {2, 2, 1}}; 
        System.out.println(sum_of_row(matrix, 0));
        System.out.println(sum_of_column(matrix, 0));
        }
    
    }
    

