package test;

public class Test {
    public static void main(String[] args) {
        int lines = 4;
        chess(lines);
    }

    private static void chess (int number){
        String starLine1 = "*-*-*-*-";
        String starLine2 = "-*-*-*-*";
        for (int i = 0; i < number; i++) {
            System.out.println(starLine1);
            System.out.println(starLine2);
        }
    }


}
