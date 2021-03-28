package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String guest = ""; //for store temporary guest's name
        String fl = Settingup.floor(); //read number of floor
        String ro = Settingup.room(); //read number of room
        int floor = Integer.parseInt(fl); //convert into integer
        int room = Integer.parseInt(ro);// convert the same
        System.out.println("=> Hotel is already setup with " + floor + " floors and " + floor * room + " room successfully."); //message success
        String array[][] = new String[floor][room]; //declare and initialize with floor & room (element depend on input floor and room)
        //finish setting up
        int choose;
        String a;
        //create switch case choose option our hotel management
        do {
            System.out.println("\n" + "================( hotel mangement system )==============");
            System.out.println("1- check in");
            System.out.println("2- checkout");
            System.out.println("3- display");
            System.out.println("4- search guest's name");
            System.out.println("5- exit");
            System.out.println("=========================================================");
            System.out.print("-> choose option(1-5) : ");
            choose = cin.nextInt();
            switch (choose) {
                case 1:
                    guest = Checkin.checkin(floor, room, array); //call checkin method
                    break;
                case 2:
                    Checkout.checkout(floor, room, array, guest); // call checkout method
                    break;
                case 3:
                    Display.display(floor, room, array); //call display
                    break;
                case 4:
                    Search.search(floor, room, array, guest); //call search
                    break;
                case 5:
                    System.out.println("-> good bye !"); //exit
                    System.exit(0);
                    break;
                default:
                    System.out.println("INPUT OPTION IS INVALID !");
            }
            while (!Regex.Readenter()) { //call regex read enter key
            }
        } while (true); //back to our menu


    }
}
