package com.company;

import java.util.Scanner;

public class Settingup {
    static public String floor() { //method for input floor and and verify when input
        Scanner cin = new Scanner(System.in);
        String floor; //for store number of floor (datatype string because regex can't use integer)
        System.out.println("\n" + "=================( setting up hotel )=================");
        do {
            System.out.print("-> Enter number of floors : "); //input floor
            floor = cin.nextLine();
            if (Regex.invalid(floor)) { //verify with regex if input string , symbol beside number it will alert
                System.out.println("INPUT IS INVALID");
            } else if (Regex.negative(floor)) { //verify with regex if input symbol with number it'll alert statment is negative
                System.out.println("INPUT IS NEGATIVE");
            }
        } while (!Regex.Verifynum(floor)); //untill user input number then loop stop
        return floor; // return floor
    }

    static public String room() { //method for input room and and verify when input the same as floor
        Scanner cin = new Scanner(System.in);
        String row;
        do {
            System.out.print("-> Enter number of rooms in each floors : ");
            row = cin.nextLine();
            if (Regex.invalid(row)) {
                System.out.println("INPUT IS INVALID");
            } else if (Regex.negative(row)) {
                System.out.println("INPUT IS NEGATIVE");
            }
        } while (!Regex.Verifynum(row));
        return row;
    }


}
