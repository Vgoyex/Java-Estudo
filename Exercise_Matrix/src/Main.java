import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");

        int n = sc.nextInt();

        if(n < 0){
            System.out.println("n below 0 is not valid");
            return;
        }
        // Creating a matrix
        int [][] matrix = new int[n][n];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                // Adding elements to the matrix
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Main diagonal: ");
        for(int i=0;i<matrix.length;i++){
            System.out.print(matrix[i][i] + " ");
        }

        int negativeNum = 0;
        for(int i = 0; i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] < 0){
                    negativeNum += 1;
                }
            }
        }

        System.out.print("\nNegative numbers: " + negativeNum);

    }
}