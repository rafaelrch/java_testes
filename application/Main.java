package application;

import entities.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Product produto1 = new Product();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data");
        System.out.print("Name: ");
        produto1.name = sc.nextLine();

        System.out.print("Price: ");
        produto1.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        produto1.qntd = sc.nextInt();

        System.out.println(produto1);

        System.out.println(" ");
        System.out.println("Enter the number of products to be added in stock: ");
        produto1.addProducts(sc.nextInt());
        System.out.println("Updated data: "+ produto1);

        System.out.println(" ");
        System.out.println("Enter the number of products to be removed from stock: ");
        produto1.removeProducts(sc.nextInt());
        System.out.println("Updated data: "+ produto1);


        sc.close();
    }
}