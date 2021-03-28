package com.company;

import java.util.Scanner;

public class Checkout {
    static public void checkout(int floor, int room, String array[][], String guest) { //call floor,room,array to use in method
        Scanner cin = new Scanner(System.in);
        int r, f; //for store value room and floor when user input
        System.out.println("=================( Checkout from hotel )=================");
        do {
            System.out.print("-> Enter floor Number" + "(1-" + floor + ") : ");
            f = cin.nextInt();
            if (f == 0) System.out.println("INPUT IS INVALID !"); //verify if user input 0
            else if (f > floor) System.out.println("INPUT IS OUT OF ELEMENT !"); //verify when user input out range
        } while (f == 0 || f > floor); //until user input correct then loop stop
        do { //the same as above
            System.out.print("-> Enter room Number" + "(1-" + room + ") : ");
            r = cin.nextInt();
            cin.nextLine();
            if (r == 0) System.out.println("INPUT IS INVALID !");
            else if (r > room) System.out.println("INPUT IS OUT OF ELEMENT !");
        } while (r == 0 || r > room);
        if (array[f - 1][r - 1] == null) //array check element that user input whether null or not
            System.out.println("=> No one checkin in this room, you can't checkout !");//if null alert statment
        else { // if have guest
            System.out.print("-> Guest Name: " + array[f - 1][r - 1]); //output name guest
            int verify; //for verify
            System.out.print(", Press '1' to checkout and '0' to cancel: ");
            verify = cin.nextInt();
            if (verify == 1) { //when user input 1
                System.out.println("=> " + guest + " has been checkout successfully ! ");
                array[f - 1][r - 1] = null; //set element that found in above to null
            } else
                System.out.println("-> your choice is cancel"); //if user input 0 just alert statment
        }
    }

}

