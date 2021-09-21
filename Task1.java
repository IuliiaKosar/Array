package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        ask user how many names they want to store
        get names from user to save
        store those names in a string array
            if the name has 5 or more than 5 letters, save it to an array as longName
            if the name has less than 5 letters, save it to an array as shortName
        print out those names arrays by using toString method
         */

        Scanner scr = new Scanner(System.in);
        System.out.println("How many names of people do you want to store?");
        int size = scr.nextInt();
        scr.nextLine();
        String [] longNames = new String[size];
        String [] shortNames = new String[size];


        for (int i = 0; i < size; i++){
            System.out.println("Please enter name");
            String name = scr.next();  // any name
             if (name.length()>=5){
                 longNames[i]=name;

             }else{
                 shortNames[i]=name;
             }
        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));

    }
}

