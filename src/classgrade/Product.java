package classgrade;

import java.util.Scanner;

public class Product {
     public static void main(String[] args) {
        Products[] pr = new Products[100];  

         try (Scanner input = new Scanner(System.in)) {
             System.out.print("Enter the number of products: ");
             int nump = input.nextInt();
             
             
             for (int i = 0; i < nump; i++) {
                 System.out.println("Enter details of product " + (i + 1) + ":");
                 
                 System.out.print("ID: ");
                 int id = input.nextInt();
                 
                 System.out.print("Name: ");
                 String name = input.next();
                 
                 System.out.print("Price: ");
                 double pri = input.nextDouble();
                 
                 System.out.print("Stock: ");
                 int st = input.nextInt();
                 
                 System.out.print("Sold: ");
                 int sold = input.nextInt();
                 
                 Products prod = new Products();
                 prod.addProduct(id, name, st, pri, sold);
                 
                 pr[i] = prod;
             }
             
             
             System.out.println("----------------------");
             System.out.println("\nProduct Details:\n");
             System.out.println("----------------------");
             
             System.out.printf("%-10s %-20s %-10s %-20s %-20s %-20s %-20s %-20s\n",
                     "ID", "Name", "Stocks", "Price", "Items Sold", "Total Expected Profit", "Total Profit", "Status");
             
             for (int i = 0; i < nump; i++) {
                 pr[i].viewProduct();
             }}
    }
}