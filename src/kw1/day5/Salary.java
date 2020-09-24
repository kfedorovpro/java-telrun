package kw1.day5;

public class Salary {
    public static void main(String[] args) {
        String s = "Сидоров";
        double hoursSidorov = 105.5;
        double kefSidorov = 1.5;
        char k = '\u20AC';
        System.out.println(k);

        String p = "Petrov";
        double hoursPetrov = 110.6;
        double kefPetrov = 1.9;

        findsalary(1.2, 1.2);
        findsalary(hoursSidorov, kefSidorov); //зп петрова
        findsalary(hoursPetrov, kefPetrov); //зп сидорова
    }

    public static void findsalary(double hours, double kef) {
        double minimalEuroperhours = 15.86;
        double resultat = hours * kef * minimalEuroperhours;
        System.out.println(Math.round(resultat));
    }


}
