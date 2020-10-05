package kw5.day20;

public class MyLovelyArray {
    public static void main(String[] args) {
        //myOldTypeInt();
        //myNewTypeArrayInt();
        int[] source = new int [] {1,2,3};
        int[] copy = getMeArrayCopy(source); //копия массива
        System.out.println(copy[2]);

    }

    private static int[] getMeArrayCopy(int[] input) {
        int[] output = new int [input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input [i];
        }
        return output;
    }

    private static void myNewTypeArrayInt() {
        int a = 10;
        int b = 50;
        int[] myNewArray = new int[]{a, b};
        int[] anotherArray = new int[10];
        //int[] thirdArray = {1, 2, 3, 4, 5}; так можно писать, но это на скоряк
        int[] secondArray = myNewArray;
        System.out.println(myNewArray[0]);
        System.out.println(myNewArray[1]);
        System.out.println(myNewArray[myNewArray.length-1]);
        secondArray[1] = secondArray [1] + 100;
        System.out.println(secondArray[1]);
        System.out.println(myNewArray[1]);
    }

/*    private static void myOldTypeInt() {
        //32 bit
        int a = 10;
        int b = a;
        b += 5;
        System.out.println(b);
        System.out.println(a);
    }*/
}
