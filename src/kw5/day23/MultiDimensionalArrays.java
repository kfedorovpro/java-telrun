package kw5.day23;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        magicMonth();
    }

    private static void magicMonth() {
        int[][] monthCalender;
        monthCalender = new int[4][7];


        for (int i = 0; i < monthCalender.length; i++) {
            for (int j = 0; j < monthCalender[i].length; j++) {
                monthCalender[i][j] = i * 7 + j + 1;
                System.out.print(monthCalender[i][j] + " ");
            }
            System.out.println();
        }
    }
}
