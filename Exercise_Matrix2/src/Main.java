import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type rows and columns: ");

        String spl = sc.nextLine();
        String[] values = spl.split(" ");
        int rows = parseInt(values[0]);
        int columns = parseInt(values[1]);

        int[][] matrix = new int[rows][columns];

        for(int i = 0;i< matrix.length; i++){
            for(int j = 0;j< matrix[i].length; j++){
                System.out.printf("Value for position: [%d] [%d]: ",i,j);
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.printf(" %d ",matrix[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nType a number to search: ");
        int searchNum = sc.nextInt();

        int appears = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                if(searchNum == matrix[i][j]){
                    appears++;
                }
            }
        }

        System.out.println("The number " + searchNum + " appears " + appears + " times!\n");

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){

                if(matrix[i][j] == searchNum){
                   System.out.printf("Position of %d: [%d] [%d]\n",searchNum,i,j);

                   if( isValid(i,(j-1),rows,columns) ){
                       System.out.printf("Left: %d \n",matrix[i][j-1]);
                   }
                    if( isValid((i-1),j,rows,columns) ){
                        System.out.printf("Up: %d \n",matrix[i-1][j]);
                    }
                   if( isValid(i,(j+1),rows,columns) ){
                       System.out.printf("Right: %d \n",matrix[i][j+1]);
                   }
                   if( isValid((i+1),j,rows,columns) ){
                       System.out.printf("Down: %d \n",matrix[i+1][j]);
                   }

                }
            }
        }


    }

    public static boolean isValid(int i, int j, int rows, int columns){
        boolean valid = i >= 0 && i < rows && j >= 0 && j < columns;
        return valid;
    }

}