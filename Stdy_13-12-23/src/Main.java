import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<Product>();

        System.out.print("Enter the number of products: ");
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            sc.nextLine();
            System.out.println("Product #" + (i+1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            String type = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(type.toLowerCase().equals("i")){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name,price,customsFee);
                productList.add(product);
            }else if(type.toLowerCase().equals("c")){
                Product product = new Product(name,price);
                productList.add(product);
            }else if(type.toLowerCase().equals("u")){
                System.out.print("Manufacture date (dd/MM/yyyy): ");
                sc.nextLine();
                String manufactureDateStr = sc.nextLine();
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                Date manufactureDate = format.parse(manufactureDateStr);
                Product product = new UsedProduct(name,price,manufactureDate);
                productList.add(product);
            }
        }
        //Printing product
        System.out.println("\nPRICE TAGS:");
        for(Product data : productList) {
            System.out.println(data);
        }
        sc.close();
    }
}