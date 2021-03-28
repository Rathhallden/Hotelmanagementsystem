package com.company;

import java.util.Scanner;

public class Display {
    public static void display(int floor, int room, String array[][]) {
        Scanner cin = new Scanner(System.in);
        int setrow = 5, totalpage, page = 1, choose = 0, length = 0; //set row to output
        if (array.length % setrow != 0) //if row of array is odd
            totalpage = (array.length / setrow + 1); //get total page
        else
            totalpage = (array.length / setrow); //if row of array not odd number get total page
        do {
            int tmprow = (page * setrow) - setrow; //set first index
            if (page != totalpage) {
                length = page * setrow; //set length as last index of output
            } else length = array.length; //length equal row of array
            System.out.println("\n" + "=====================( hotel information )=======================" + "\n");
            System.out.println("-----------------------------------------------------------------");
            for (int row = tmprow; row < length; row++) { //output floor depend length
                System.out.print("Floor " + (row + 1) + " : " + "\t"); //output floor
                for (int col = 0; col < array[row].length; col++) { //output room
                    System.out.print(array[row][col] + "\t" + "\t");
                }
                System.out.println();
                System.out.println("-----------------------------------------------------------------");
            }
            System.out.println("--> Page : " + page + "/" + totalpage + "\t" + "\t" + "\t" + "Total Floor : " + floor + " |" + " Total Room : " + (room * floor));
            System.out.println("=================================================================" + "\n");
            System.out.println("-------------------------( Page control )------------------------");
            System.out.println("1. Next Page");
            System.out.println("2. Previous Page");
            System.out.println("3. First Page");
            System.out.println("4. Last Page");
            System.out.println("0. Exit to Homepage");
            System.out.println("-----------------------------------------------------------------");
            System.out.print("-> Enter your choice [0-4] : ");
            choose = cin.nextInt();
            switch (choose) {
                case 1:
                    if (page < totalpage) //validate when user input out of element
                        page++; //increase page
                    break;
                case 2:
                    if (page > 1)
                        page--; //decrease page
                    break;
                case 3:
                    page = 1; //page 1 is first page
                    break;
                case 4:
                    page = totalpage; //total page = last page
                    break;
                case 0:
                    break;
            }

        } while (choose != 0); //until user input 0 then loop stop

//        for (int i = 0; i < array.length; i++) {
//            System.out.print("Floor" + (i + 1) + " : ");
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
    }
}
