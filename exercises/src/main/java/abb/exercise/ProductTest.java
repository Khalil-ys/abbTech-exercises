package abb.exercise;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the product: ");
        String productName = sc.nextLine();
        Product product = new Product(productName);

        // Print out the details of the product
        System.out.println("Company Name: " + Product.companyName);
        System.out.println("Product ID: " + product.getProductID());
        System.out.println("Product Name: " + product.getProductName());

        sc.close();
    }
}