package com.company;
import java.util.Scanner;
public class Smallest_number_of_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
       int  a = scan.nextInt();

        System.out.println("Enter second number");
      int  b= scan.nextInt();

        System.out.println("Enter third number");
      int   c= scan.nextInt();

        scan.close();

        System.out.println("The smallest number is "+smallestOne(a,b,c));

    }


    public static int smallestOne(int a, int b, int c) {
        if (a <=b && a <= c) {
            return a;
        }

        if (b <= a && b <= c) {
            return b;
        }

        if (c < b && c < a) {

        }

        return c;

    }


}
