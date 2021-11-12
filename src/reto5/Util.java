package reto5;

import java.util.ArrayList;

public class Util {

    public static ArrayList<Integer> stringToArray(String c) throws NumberFormatException{

        ArrayList<Integer> integers = new ArrayList<>();

        // Comprobar formato
        if(!c.startsWith("[") || !c.endsWith("]")|| !c.contains(",")){
            throw new NumberFormatException("ERROR: Format Error");
        }

        // Separar cadena
        int num = c.length();
        String withoutBrackets = c.substring(1, num-1); //substring: extrae caracteres de principio a fin (exclusivo)
        String[] a = withoutBrackets.split(",");

        for(String s : a) {
            if(isInteger(s)) {
                integers.add(Integer.parseInt(s));
            }else{
                throw new NumberFormatException("ERROR: Element isn't an integer.");
            }
        }
        return integers;
    }

    // Comprobador número entero
    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

}
