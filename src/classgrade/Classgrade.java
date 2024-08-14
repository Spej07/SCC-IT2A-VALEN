package classgrade;

import java.util.Scanner;


public class Classgrade {

  
    public static void main(String[] args) {
      
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = input.next();
        System.out.print("Enter marks in: ");
        System.out.print("Enter Math: ");
        int m = input.nextInt();
        System.out.println("Enter Science: ");
        int s = input.nextInt();
        System.out.println("Enter English: ");
        int e = input.nextInt();
        System.out.println("Enter Computer: ");
        int c = input.nextInt();

        System.out.println("-----------------------------------");
        System.out.println("Grade Detail");
        System.out.println("------------------------------------");

        System.out.println("Name:" + name);
        System.out.println("Total Marks:" + (m + s + e + c));
        float test = (m + s + e + c) / 4;
        System.out.println(String.format("% ,2f", test));

    }

}

    
    




    
   