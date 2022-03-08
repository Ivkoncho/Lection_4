package com.company;

public class Sumoftwonumbers {

    public static void main(String[] args){

        int a=3;
        int b =5;

    System.out.println("Simple sum "+ (a+b));
        System.out.println("The result is "+ sum(a,b));
        System.out.println("The result is "+ multiplication(a,b));
        System.out.println("The result is "+ division(b,a));
        System.out.println("The result is "+ subtraction(a,b));



    }
     public static int sum(int number1, int number2){
        int result=number1 + number2;

         return result;
     }

    public static int multiplication(int number1, int number2){
        int result=number1 *number2;

        return result;
    }

    public static int division(int number1, int number2){
        int result=number1/ number2;

        return result;
    }

    public static int subtraction(int number1, int number2){
        int result=number1 - number2;

        return result;
    }
}
