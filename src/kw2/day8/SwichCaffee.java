package kw2.day8;

public class SwichCaffee {
    public static void main(String[] args) {
        int button = 5; // номер кнопки вендингмашины
        vendingMachine(button);
    }

    private static void vendingMachine(int customerChoose) {
        switch (customerChoose) {
            case 1:
                System.out.println("Кофе Американо готовится...");
                break;
            case 2:
                System.out.println("Кипяток производится...");
                break;
            case 3:
                System.out.println("Кофе Эспрессо готовится...");
                break;
            case 4:
                System.out.println("Какое уже в пути!");
                break;
            case 5:
                caffeWithMilk();
                break;
            default:
                System.out.println("Повторите пожалуйста свой выбор! \nНапиток под номером " + customerChoose + " временно не доступен.");
                break;
        }
        System.out.println("\nПрограмма отработана без ошибок");
    }

    public static void caffeWithMilk() {
        System.out.println("Вода кипятится");
        System.out.println("Кофе мелится");
        System.out.println("Сливки добавляются");
    }
}
