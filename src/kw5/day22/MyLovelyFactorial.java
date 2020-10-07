package kw5.day22;

public class MyLovelyFactorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(7));
        System.out.println(getFactorial(5)); //120
        System.out.println(getFactorial(8));
        System.out.println(getFactorialRecursion(7));
        System.out.println(getFactorialRecursion(5));
        System.out.println(getFactorialRecursion(8));
    }

    private static int getFactorialRecursion(int number) {
        if (number < 1){
            return 1;
        } else {
            return number * getFactorialRecursion(number-1);
        }
    }

    private static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}

// <= очень важно! так как до 7 и 5 включительно
