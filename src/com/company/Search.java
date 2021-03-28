package com.company;

import java.util.Scanner;

public class Search {
    public static void search(int floor, int room, String array[][], String guest) {//call floor,room,array to use in method
        Scanner cin = new Scanner(System.in);
        String name; //for search by floor
        int count = 0, search; //for count and search by floor
        String choose; //for choose in switch case
        do {
            System.out.println("\n" + "====================( search option )====================");
            System.out.println("a. Search by name");
            System.out.println("b. Search by floor");
            System.out.print("=> Enter your choose (a or b) : ");
            choose = cin.nextLine();
            if (!Regex.onlychar(choose)) //verify with regex when user wrong input
                System.out.println("\n" + "--> PLEASE ENTER CHARACTER [a-b] !");
        } while (!Regex.onlychar(choose)); //until user input correct loop stop
        switch (choose) {
            case "a":
            case "A": //a and A are too match when user input
                System.out.println("\n");
                do {
                    System.out.println("===================( search by name )==================");
                    System.out.print("-> Enter guest's name to search : "); //input name guest
                    name = cin.nextLine();
                    if (Regex.onlystring(name))
                        System.out.println("INPUT IS INVALID !"); //verify with regex when user wrong input
                } while (Regex.onlystring(name)); //until input correct loop stop
                for (int i = 0; i < array.length; i++) { // loop all floor
                    for (int j = 0; j < array[i].length; j++) {  //loop all room
                        if (name.equals(array[i][j])) { //check name between user input with name in array
                            System.out.println("=> Result of searching : ");
                            System.out.println("Guest's Name : " + array[i][j] + " is in Room : " + "'" + (j + 1) + "'" + " On Floor : " + "'" + (i + 1) + "'"); //if equal ouput name and room
                            count += 1; //count 1
                        }
                    }
                }
                if (count == 0) { //if not match with name output statment
                    System.out.println("=> Result of searching : ");
                    System.out.println("Guest : " + name + " not stay here !");
                }
                break;
            case "b":
            case "B":
                System.out.println("===================( search by floor )===================");
                do {
                    System.out.print("-> Enter floor to search (1-" + floor + ")" + " :"); //input floor
                    search = cin.nextInt();
                    if (search == 0) System.out.println("INPUT IS INVALID !"); //verify when user input
                    else if (search > floor) System.out.println("INPUT IS OUT OF ELEMENT !");
                    System.out.println("=> Result of searching floor " + search + " :");
                } while (search == 0 || search > floor); //until user input correct
                for (int i = 0; i < 1; i++) { //loop only once floor that user input
                    for (int j = 0; j < array[i].length; j++) {
                        if (array[search - 1][j] != null) { //check each room in floor that input. if not null just alert guest name
                            System.out.println("Guest's Name : " + array[search - 1][j] + " is in Room : " + "'" + (j + 1) + "'" + " On Floor : " + "'" + (search) + "'");
                        } else { //if null just alert statment
                            System.out.println("-> Room " + (j + 1) + " are available !");
                        }
                    }
                }
                break;
        }
    }
}
