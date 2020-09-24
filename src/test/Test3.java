package test;

public class Test3 {
    public static void main(String[] args) {
        String n = "\n";
        String star = "*";
        String minus = "-";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(star + minus);
            }
            System.out.print(n);
            for (int j = 0; j < 4; j++) {
                System.out.print(minus + star);
            }
            System.out.print(n);
        }
    }
}
