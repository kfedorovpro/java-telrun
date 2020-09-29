package test;

public class Test5 {
    public static void main(String[] args) {
        int numRows = 10;
        for (int i = 0; i <= numRows; i++) {
            for (int j = 0; j <= numRows; j++) {
                if (i + j >= numRows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}