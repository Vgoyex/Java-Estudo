package entities;

import java.util.Scanner;

public class Products {
    public String name;
    public int qtd;
    public double price;

    Scanner sc = new Scanner(System.in);

    public Products(){

    }

    public Products(String nm, double price, int qtd){
        this.name = nm;
        this.price = price;
        this.qtd = qtd;
    }

    public double getPrice() {
        return price;
    }

    public int getQtd() {
        return qtd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return name;
    }
    
    public double stockPrice(){
        return qtd * price;
    }

    public void showProductInfo(){
        System.out.print("\nProduct data:"+ name + "| units " + qtd + "|Price: " + String.format("%.2f",price));
        System.out.print("| Total: $"+  String.format("%.2f",stockPrice()) + "\n");
    }

    public void addProducts(){
        System.out.print("Insert a quantity will be added: ");
        int value = sc.nextInt();
        this.qtd += value;
    }

    public void removeProducts(){
        System.out.print("Insert a quantity to be removed: ");
        int value = sc.nextInt();
        this.qtd -= value;
    }

}
