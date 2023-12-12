import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //averageProducts();
        //negativeNumbers();
        //avHeight();
    }
    public static void averageProducts(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number of products: ");
        int n = sc.nextInt();
        Products[] productsArray = new Products[n];

        for(int i = 0;i<n;i++){
            System.out.printf("Type the name of a product: " + i + ": ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.printf("Type the price of product " + i + ": ");
            double price = sc.nextDouble();
            productsArray[i] = new Products(name,price);
        }

        double sum = 0;
        for(int i = 0;i<n;i++){
            sum = sum + productsArray[i].getPrice();
        }
        double average = sum/n;

        System.out.printf("Products total price: %.2f",sum);
        System.out.printf("\nAverage Price: %.2f\n",average);
}
    public static void negativeNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers will be added (from 1 to 10): ");
        int n = sc.nextInt();
        int[] arrayNumbers = new int[n];
        if(n > 10){
            System.out.print("Number to be added over 10");
            return;
        }
        else{
            for(int i = 0; i < n;i++){
                System.out.printf("Write a number for position [%d]: ",i);
                arrayNumbers[i] = sc.nextInt();
            }
            System.out.println("Negative Numbers: ");
            for(int i= 0;i<arrayNumbers.length;i++){
                if(arrayNumbers[i] < 0){
                    System.out.println(arrayNumbers[i]);
                }
            }
        }
    }
    public static void avHeight(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number of elements to an array: ");
        int n = sc.nextInt();
        double[] array = new double[n];
        double sum = 0;

        for(int i=0;i<n;i++){
            System.out.printf("Type the number of position " + i + ": ");
            array[i] = sc.nextDouble();
            sum = sum + array[i];
        }
        for(int i=0;i<n;i++){
            if(i == (n-1)){
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + " | ");
        }

        double height = sum / n;
        System.out.printf("\nAverage height: %.2f", height);

        sc.close();
    }

}