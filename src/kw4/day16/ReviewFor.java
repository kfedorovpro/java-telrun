package kw4.day16;

public class ReviewFor {
    public static void main(String[] args) {
        String word1 = "Я люблю Ярославль!";
        String word2 = "Я люблю Берлин!";
        String word3 = "Никто не любит тебя!";

        System.out.println(countYa(word1));
        System.out.println(countYa(word2));
        System.out.println(countYa(word3));
    }

    private static int countYa(String original) {
        String input = original.toLowerCase();
        char ya = 'я';
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ya) {
                count++;
            }

        }
        return count;
    }
}
