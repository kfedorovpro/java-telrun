package kw5.day22;

public class StringCities {
    public static void main(String[] args) {
        String[] myCities = new String[]
                {"Berlin",
                        "Hamburg",
                        "Potsdam",
                        "Frankfurt",
                        "Muenchen",
                        "Dresden",
                        "Hannover"};
//        myPrintStringArray(myCities);
        myPrintForI(myCities);
    }

    private static void myPrintForI(String[] myCities) {
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        System.out.print("[");
        for (int i = 0; i < myCities.length - 1; i++) {
            if (i % 2 != 0) {
                System.out.print(ANSI_CYAN_BACKGROUND + ANSI_RED + myCities[i] + ANSI_RESET + ", ");
            } else {
                System.out.print(ANSI_GREEN + myCities[i] + ANSI_RESET + ", ");
            }
        }
        System.out.print(ANSI_GREEN + myCities[myCities.length - 1] + ANSI_RESET);
        System.out.println("]");
    }

    private static void myPrintStringArray(String[] input) {
        System.out.print("[");
        for (String element : input) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }
}

