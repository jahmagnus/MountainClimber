package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        boolean quit = false;

        while(!quit){

            System.out.println("Please make selection \n"+
                    "0 - quit\n" +
                    "1 - calculate mountain walk time");
                    int selection = sc.nextInt();

            switch (selection){
                case 0: quit = true;
                break;

                case 1: calculateWalk();
                break;
            }
        }

    }

    private static void calculateWalk (){

        System.out.println("Please enter the walk distance in Kilometers");
        double distance = sc.nextDouble();
        System.out.println("Please enter the elevation of the hill in meters");
        double elevation = sc.nextDouble();

        double distanceAnswer = distance/5;
        double elevationFactor = elevation/600;

        double walkTime = distanceAnswer + elevationFactor;

        System.out.println("This walk should take approximately " + Math.round(walkTime) + " hours");
    }
}
