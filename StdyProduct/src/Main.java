import entities.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Products ft = new Products();

        System.out.print("Enter product data: \nName: ");
        ft.name = sc.nextLine();
        System.out.print("Quantity: ");
        ft.qtd = sc.nextInt();
        System.out.print("Price: ");
        ft.price = sc.nextDouble();

        ft.showProductInfo();

        ft.addProducts();
        ft.showProductInfo();

        ft.removeProducts();
        ft.showProductInfo();
        sc.close();
    }
}