package kw3.day11;

public class HomeWork2 {
    public static void main(String[] args) {
        findNumberModulo(10,200,17);
    }

    public static void findNumberModulo(int a, int b, int myModulo) {
        for (int i = a; i < b; i++) {
            if (i % myModulo == 0) {
                System.out.println(i + "");
            }
        }
    }
}
