package kw6.day27;

public class ExerciseString14Doc12 {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB")); //→ true
        System.out.println(xyzMiddle("AxyzBB")); //→ true
        System.out.println(xyzMiddle("AxyzBBB")); //→ false
    }

    private static boolean xyzMiddle(String str) {
        String xyz = "xyz";
        int xyzStart = str.indexOf(xyz);
        int xyzEnd = xyzStart + 2;
        int countSymbolsStart = xyzStart;
        int countSymbolsEnd = str.length() - xyzEnd - 1;
        int difference = Math.abs(countSymbolsStart - countSymbolsEnd);
        if (difference <= 1) {
            return true;
        }
        return false;
    }
}
