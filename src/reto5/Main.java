package reto5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String testString = getString();
        try{
            System.out.println(Util.stringToArray(testString));
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }

        //Leer el string
        public static String getString(){
            System.out.println("Enter a string to convert it in Array of integers : ");
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
    }

