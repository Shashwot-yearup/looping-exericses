package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) {

        //while loop to run I love java 5 times.
        int i = 1;
        while (i <= 5) {
            System.out.println("I love java");
            i++;
        }

        //added a do while loop to print I love java 5 times.
        int j = 1;
        do {
            System.out.println("I love java 2");
            j++;

        } while(j <= 5);
    }
}