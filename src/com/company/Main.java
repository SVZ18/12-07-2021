package com.company;

import java.util.Scanner;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //Vehicle class
        Vehicle vehicle = new Vehicle();
        vehicle.setLength(3);
        vehicle.setSeats(4);
        vehicle.setTyres(4);
        vehicle.getSpeed(45); // for some reason I cannot insert any number
        vehicle.setBrand("Mazda");

        vehicle.startEngine(true);
        vehicle.stopEngine(false);
        vehicle.slowDown();
        vehicle.speedUp();


        // Loop
        // Program that counts in descending order from 100 - 0;
        //print out only the values that are divisible by 6.
//        for (int i = 100; i >= 1 ; i--) {
//            if (i % 6 == 0) {
//                System.out.println(i);
        //           }


//        }
        // Average done
        // Program that takes inout from the user for 10 numbers
        // find the average of those numbers
        Scanner scanner = new Scanner(System.in);


//        System.out.println("Enter the number of values you want to get the average:");
//        float[] numbers = new float[scanner.nextInt()];

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Enter the next number");
//            numbers[i] = scanner.nextFloat();

//        }
//        float sum = 0;
//        for(int i = 0; i < numbers.length; i++) {
//           sum += numbers[i];
//        }
//        System.out.println("The average of the " + numbers.length + " numbers is " + sum/ numbers.length);

        //Strings done
//        System.out.println("Enter a string");
//        String a = scanner.nextLine();

//        System.out.println("Enter a string");
//        String b = scanner.nextLine();

//        System.out.println("Enter a string");
//        String c = scanner.nextLine();

//        System.out.println("Enter a string");
//        String d = scanner.nextLine();

//        System.out.println("Enter a string");
//        String e = scanner.nextLine();

//        String sentence = a + " " + b + " " + c + " " + d + " " +e;
//        System.out.println(sentence);


        //Largest number done
//        int n, max;
//        System.out.println("Enter the amount of numbers: ");
//        n = scanner.nextInt();
//        int values[] = new int[n];
//        System.out.println("Enter the numbers: ");
//        for (int i = 0; i < n; i++) {
//            values[i] = scanner.nextInt();
//        }
//        max = values[0];
//        for (int i = 0; i < n; i++) {
//            if (max < values[i]) {
//                max = values[i];
//
//            }
//        }
//        System.out.println("The Largest Number is:" + max);
    }


    //  Odd numbers done
//        System.out.println("Enter amount of numbers: ");
//        int[] num = new int[scanner.nextInt()];
//        int oddNum = 0;

//        for (int i = 0; i < num.length; i++) {
//            System.out.println("Enter the next number");
//            num[i] = scanner.nextInt();

//        }
//        for (int i = 0; i < num.length; i++) {
//            if ( i % 2 != 0) {
//                oddNum++;
    //           }

    //       }
    //       System.out.println("There are " + oddNum + " odd numbers");

 //   }

}