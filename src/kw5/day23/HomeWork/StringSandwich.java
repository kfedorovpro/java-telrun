package kw5.day23.HomeWork;

public class StringSandwich {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread")); // →"jam"
        System.out.println(getSandwich("xxbreadjambreadyy")); // →"jam"
        System.out.println(getSandwich("xxbreadyy")); // →""
    }

    private static String getSandwich(String str) {
        String output = "";
        String search = "bread";
        if (str.indexOf(search) != -1) {
            String temporary = str.substring(str.indexOf(search) + search.length());
            int index1 = str.indexOf(search) + search.length();

            if (temporary.indexOf(search) != -1) {
                int index2 = index1 + temporary.indexOf(search);
                output = str.substring(index1, index2);
            }
        }
        return output;
    }

}
