package com.company;
public class Main {
    public static void main(String[] args) {
        CoffeeMachinee Machine = new CoffeeMachinee();
        Machine.waterInMachine = 400;
        Machine.milkInMachine = 540;
        Machine.coffeeInMachine = 120;
        Machine.cupsInMachine = 9;
        Machine.moneyInMachine = 550;

        Machine.processInputCommands(Machine);
        do {
            switch (Machine.action) {
                case "buy":
                    Machine.buy(Machine);
                    Machine.processInputCommands(Machine);
                    break;
                case "fill":
                    Machine.fill(Machine);
                    Machine.processInputCommands(Machine);
                    break;
                case "remaining":
                    Machine.remaining(Machine);
                    Machine.processInputCommands(Machine);
                    break;
                case "take":
                    Machine.take(Machine);
                    Machine.processInputCommands(Machine);
                    break;
                case "exit":
                    Machine.exit(Machine);
                    break;
            }
        } while(!Machine.action.equals("exit"));
    }
}
