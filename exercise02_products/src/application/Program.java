package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormatted = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse("3033-03-13");
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            switch (productType) {
                case 'c':
                    Product product = new Product(name, price);
                    products.add(product);
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYY): ");
                    String manufactureDate = sc.next();
                    LocalDate manufactureDateParse = LocalDate.parse(manufactureDate, dateFormatted);
                    Product product1 = new UsedProduct(name, price, manufactureDateParse);
                    products.add(product1);
                    break;
                default:
                    System.out.print("Custom fee: ");
                    double fee = sc.nextDouble();
                    Product product2 = new ImportedProduct(name, price, fee);
                    products.add(product2);
                    break;
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : products) {
            System.out.println(p);
        }
        sc.close();
    }
}
