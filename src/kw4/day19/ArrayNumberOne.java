package kw4.day19;

public class ArrayNumberOne {
    public static void main(String[] args) {
        //  System.out.println(homeWork18_01());
        //myfirstDoubleArrayPrint(homeWork18_01());
        double[] massiv = new double[]{3.3, 5.5, 3.2, 4.9, 3.5, 7.0};
        System.out.println(myMax(massiv));
    }
    

    private static double myMax(double[] lyuboy) {
        double max = lyuboy[0];
        for (int i = 0; i < lyuboy.length; i++) {
            max = Math.max(max,lyuboy [i]);
        }
        return max;
    }

    private static void myfirstDoubleArrayPrint(double[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }

    private static double[] homeWork18_01() {
        double[] output;
        output = new double[10];
        output[0] = 25.85;
        for (int i = 0; i < output.length; i++) {
            output[i] = Math.random();
        }
        return output;
    }
}
