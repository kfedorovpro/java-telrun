package kw2.day8;

public class CoffeMachineAppStartfromAnotherProgramm {
    public static void main(String[] args) {
        CoffeMachine.latte(); //ссылается на CoffeMachine.java
        CoffeMachine.americano();
        CoffeMachine.cappuccino();
        CoffeMachine.water(100);
    }
}
