package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

        //forloop that count downs for 10 to 1.
        for (int i = 10; i > 0; i--){
            System.out.println("count down " + i);
        }

        //slows down the loop
        Thread.sleep(1000);

        //sout the launch.
        System.out.println("Launch");
    }
}
