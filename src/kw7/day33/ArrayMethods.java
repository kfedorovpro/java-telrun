package kw7.day33;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = createRandomArray(10);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    private static int[] createRandomArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }
}
