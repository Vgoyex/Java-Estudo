import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        List<Order> orderList = new ArrayList<Order>();
        List<OrderItem> itemList = new ArrayList<OrderItem>();
        List<Client> clientList = new ArrayList<Client>();
        List<Product> productList = new ArrayList<Product>();

        DateFormat formatData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.print("Enter how many clients will be configured: ");
        int clientNum = sc.nextInt();

        for(int i=0;i<clientNum;i++) {
            // ------------------------- Client section ----------------------------------
            System.out.println("Enter client data:");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Birth Date(dd/MM/yyyy): ");
            String birthDateStr = sc.nextLine();
            DateFormat bDateF = new SimpleDateFormat("dd/MM/yyyy");
            Date birthDate = bDateF.parse(birthDateStr);

            Client client = new Client(name,email,birthDate);
            clientList.add(client);
            // ---------------------------------------------------------------------------

            // ------------------------- Order section ----------------------------------
            System.out.println("Enter order data: ");
            System.out.println("Status List:  PENDING_PAYMENT,\n" +
                    "    PROCESSING,\n" +
                    "    SHIPPED,\n" +
                    "    DELIVERED");

            System.out.print("Status: ");
            String scStatus = sc.nextLine();
            String status = scStatus.toUpperCase();
            OrderStatus statusEnum = OrderStatus.valueOf(status);
            Date moment = new Date();

            Order order = new Order(moment,statusEnum,client);
            orderList.add(order);
            // ---------------------------------------------------------------------------

            // ------------------------- Order Item section ------------------------------
            System.out.print("\nHow many items to this order: ");
            int orders = sc.nextInt();

            for(int x=0;x<orders;x++) {
                System.out.println("Enter #" + (x+1) + " item data: ");
                System.out.print("Product name: ");
                sc.nextLine();
                String productName = sc.nextLine();
                System.out.print("Product price: ");
                Double productPrice = sc.nextDouble();
                System.out.print("Quantity: ");
                Integer quantity = sc.nextInt();


                Product product = new Product(productName,productPrice);
                productList.add(product);

                OrderItem orderItem = new OrderItem(quantity,productPrice,product);
                itemList.add(orderItem);

                order.addItem(orderItem);
            }
            // ---------------------------------------------------------------------------
        }

        System.out.println("\nORDER SUMMARY\n");
        for(Order dataOrder : orderList){
            System.out.print("Order moment: " + formatData.format(dataOrder.getMoment()) + "\n");
            System.out.print("Order status: " + dataOrder.getStatus() + "\n");

            for(Client dataClient : clientList){
                System.out.print("Client: " + dataClient + "\n");
            }
            System.out.println("Order items:");
            for(OrderItem dataItem : itemList){
                System.out.println(dataItem);
            }
            System.out.println("Total price: $" + dataOrder.total());
        }

    }
}