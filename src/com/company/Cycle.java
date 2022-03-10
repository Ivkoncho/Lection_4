package com.company;
import java.util.Scanner;
public class Cycle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius");
        double r = scan.nextInt();
        scan.close();



        System.out.println("The Cycle is " + Cycle(r));

    }

        public static double Cycle(double r){
        double S= 3.14 * r*r;
    return S;
        }




}
