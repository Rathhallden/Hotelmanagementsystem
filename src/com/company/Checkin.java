package com.company;

import java.util.Scanner;

public class Checkin {
    public static String checkin(int floor, int room, String array[][]) {//call floor,room,array to use in method
        Scanner cin = new Scanner(System.in);
        int r, f; //for input floor,room
        String guest = ""; //for input guest's name
        System.out.println("\n" + "====================( Check in hotel )===================");
        do {
            System.out.print("-> Enter floor Number" + "(1-" + floor + ") : "); //input floor
            f = cin.nextInt();
            if (f == 0) System.out.println("INPUT IS INVALID !");       //condition when user input 0
            else if (f > floor)
                System.out.println("INPUT IS OUT OF ELEMENT !"); //when user input bigger than our elemtn
        } while (f == 0 || f > floor); //untill user correct input loop stop
        do { //the same like floor
            System.out.print("-> Enter room Number" + "(1-" + room + ") :  ");
            r = cin.nextInt();
            cin.nextLine();
            if (r == 0) System.out.println("INPUT IS INVALID !");
            else if (f > floor) System.out.println("INPUT IS OUT OF ELEMENT !");
        } while (r == 0 || r > room); //after user input floor and room
        if (array[f - 1][r - 1] == null) { //point to element that user input and check null or not
            System.out.print("-> Enter guest's name : "); //if null can input guest
            guest = cin.nextLine();
            System.out.println("=> " + guest + " check in successfully !");
            array[f - 1][r - 1] = guest; // guest name transfer to array
        } else
            System.out.println("-> This room already checked in, please find another room !"); //when check not null alert statment
        return guest;
    }
}
