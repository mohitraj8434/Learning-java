import java.util.Scanner;
public class SpiralMatrix {
   public static void printspiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        
        while(startRow <= endRow && startCol <= endCol){
            // top elements
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            // right side element
            for(int i=startRow+1; i<=endRow; i++){
                
                  System.out.print(matrix[i][endCol] + " ");
            }
            // Bottom side 
            for(int j=endCol-1; j>=startCol; j--){
                  if(startRow==endRow){
                    break;
                }
                  System.out.print(matrix[endRow][j] + " ");
            }
            // left side 
            
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol==endCol){
                    break;
                }
                  System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    // Diagonal sum of the matrix 

    public static int diagonalsum(int matrix[][]){
        int sum = 0;
        // for(int i=0; i<matrix.length; i++){

        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i==j){
        //             sum += matrix[i][j];
        //         } else if(i+j==matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        for(int i=0; i<matrix.length; i++){
            // primary diagonal 
            sum += mattrix[i][i];

            // secondary diagonal 
            if(i != matrix.length -1 - i){
                sum += matrix[i][matrix.length - i - 1];
            }
        }


        return sum;
    }


    // Stair search in 2D matrix

    public static boolean stairsearch(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length 1;

        while(raw < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("key found at ( " + row + "," + col + " ) ");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key is not found ");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
     printspiral(matrix);   

// for stair search 
int matrix[][] = {
        {10,20,30,40},
        {15,25,35,45},
        {27,29,37,48},
        {32,33,39,50}
}
     int key = 15;
     stairsearch(matrix, key);
    }
}