package kw3.day11;

public class ClassWork2 {
    public static void main(String[] args) {
        //threeNumber();
        threeAngle(10);
    }

    private static void threeAngle(int lines) {
        String star = "*";
        String myLines = "";
        for (int i = 0; i < lines; i++) {
            myLines = myLines + star;
            System.out.println(myLines);
        }

    }

    public static void threeNumber() {
        for (int x = 1; x <= 36; x++) {
            for (int y = x; y <= 36; y++) {
                for (int z = y; z <= 36; z++) {
                    if (x * y * z == 36) {
                        System.out.println("Вариант, где " + "x=" + x + ", y=" + y + ", z=" + z);
                    }

                }

            }
        }
    }

}
