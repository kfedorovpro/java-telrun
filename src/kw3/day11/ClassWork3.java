package kw3.day11;

public class ClassWork3 {
    public static void main(String[] args) {
        System.out.println(teaParty(6, 8)); //→ 1
        System.out.println(teaParty(3, 8)); //→ 0
        System.out.println(teaParty(20, 6)); //→ 2
    }

    private static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea / candy >= 2 || candy / tea >= 2) {
            return 2;
        }
            return 1;
    }
}

