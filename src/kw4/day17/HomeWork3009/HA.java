package kw4.day17.HomeWork3009;

public class HA {
    public static void main(String[] args) {
        System.out.println(getMeMax(15, 5)); //→ 15
        System.out.println(getMeMax(4, 16)); //→ 16
        System.out.println(getMeMax(20, 100)); //→ 100

        split();

        System.out.println(getMeMin(15, 45)); //→ 15
        System.out.println(getMeMin(44, 16)); //→ 16
        System.out.println(getMeMin(200, 100)); //→ 100

        split();

        System.out.println(myFirstCompareTo("Berlin", "Moscow")); //→ "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow")); //→ "Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris")); //→ "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам")); //→ "Могилёв"

        split();

        numberINTB(5, 8);

        split();

        fromAtoB(5,17);
    }

    private static void fromAtoB(int a, int b) {
        //Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
        int count = 5;
        do {
            count++;
            System.out.println("" + count);
        } while (count < b-1);
    }

    private static void numberINTB(int a, int b) {
        //Даны целые числа A и B, где B > 0. Вывести B раз число A.
        int counter = 0;
        while (counter < b) {
            int number = counter + 1;
            System.out.println(number + ". " + a);
            counter++;

        }
    }

    private static String myFirstCompareTo(String city1, String city2) {
        if (city1.charAt(0) < city2.charAt(1)) {
            return city1;
        } else {
            return city2;
        }
    }

    private static int getMeMin(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    private static void split() {
        System.out.println("--------------");
    }


    private static int getMeMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
