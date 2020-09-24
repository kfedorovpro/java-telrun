package kw1.day3.hw3;

public class MyLoveString {
    public static void main(String[] args) {
        String myFirstString = "Это мое первое предложение";
        System.out.println(myFirstString);
        String s1 = ""; //пустой
        String s2 = " "; //пробел

        String result = "Мое второе предложение " + myFirstString + "Мое третье предложение " + s2;
        System.out.println(result);
    }
}
