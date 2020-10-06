package kw5.day21;

import java.util.Arrays;

public class PrintArrayString {
    public static void main(String[] args) {
        String[] germanCites = new String[]{"Berlin", "Hamburg", "Potsdam", "Frankfurt", "Muenchen", "Dresden", "Hannover"};
        String[] ukrainCites = new String[]{"Киев", "Херсон", "Харьков", "Днепропетровск", "Львов", "Одесса", "Донецк"};
        myPrintStringArray(germanCites);
        myPrintStringArray(ukrainCites);
    }

    public static void myPrintStringArray(String[] input) {
        System.out.println(Arrays.toString(input));
    }

}
