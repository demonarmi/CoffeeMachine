package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        class CoffeeMachinee {
            int waterInMachine;
            int milkInMachine;
            int coffeeInMachine;
            int cupsInMachine;
            int moneyInMachine;

            public void showProducts(CoffeeMachinee CF) {
                System.out.println();
                System.out.println("The coffee machine has: ");
                System.out.println(CF.waterInMachine + " of water");
                System.out.println(CF.milkInMachine + " of milk");
                System.out.println(CF.coffeeInMachine + " of coffee beans");
                System.out.println(CF.cupsInMachine + " disposable cups");
                System.out.println("$" + CF.moneyInMachine + " of money");
                System.out.println();
            }
        }

        CoffeeMachinee Machine = new CoffeeMachinee();
        Machine.waterInMachine = 400;
        Machine.milkInMachine = 540;
        Machine.coffeeInMachine = 120;
        Machine.cupsInMachine = 9;
        Machine.moneyInMachine = 550;
        final int espressoWater = 250;
        final int espressoBeans = 16;
        final int latteWater = 350;
        final int latteMilk = 75;
        final int latteBeans = 20;
        final int cappuccinoWater = 200;
        final int cappuccinoMilk = 100;
        final int cappuccinoBeans = 12;
        String action;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit)");
        do {
            action = scanner.next();
            switch (action) {
                case "buy":
                    System.out.println();
                    System.out.println("What do You want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
                    String menu = scanner.next();
                    switch (menu)
                    {
                        case "1":
                            if (espressoWater <= Machine.waterInMachine && espressoBeans <= Machine.coffeeInMachine && Machine.cupsInMachine >= 1){
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                Machine.waterInMachine -= 250;
                                Machine.coffeeInMachine -= 16;
                                Machine.cupsInMachine -= 1;
                                Machine.moneyInMachine += 4;

                            }else if (espressoWater > Machine.waterInMachine){
                                System.out.println("Sorry, not enough water");
                                System.out.println();
                            }else if (espressoBeans > Machine.coffeeInMachine){
                                System.out.println("Sorry, not enough coffee beans");
                                System.out.println();
                            }else {
                                System.out.println("Sorry, not enough cups");
                                System.out.println();
                            }
                            break;
                        case "2":
                            if (latteWater <= Machine.waterInMachine && latteMilk <= Machine.milkInMachine && latteBeans <= Machine.coffeeInMachine && Machine.cupsInMachine >=1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                Machine.waterInMachine -= 350;
                                Machine.milkInMachine -= 75;
                                Machine.coffeeInMachine -= 20;
                                Machine.cupsInMachine -= 1;
                                Machine.moneyInMachine += 7;
                                System.out.println();
                            }else if (latteWater > Machine.waterInMachine){
                                System.out.println("Sorry, not enough water");
                                System.out.println();
                            }else if (latteBeans > Machine.coffeeInMachine){
                                System.out.println("Sorry, not enough coffee beans");
                                System.out.println();
                            }else if (latteMilk > Machine.milkInMachine){
                                System.out.println("Sorry, not enough milk");
                                System.out.println();
                            } else {
                                System.out.println("Sorry, not enough cups");
                                System.out.println();
                            }
                            break;
                        case "3":
                            if (cappuccinoWater <= Machine.waterInMachine && cappuccinoMilk <= Machine.milkInMachine && cappuccinoBeans <= Machine.coffeeInMachine && Machine.cupsInMachine >=1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                Machine.waterInMachine -= 200;
                                Machine.milkInMachine -= 100;
                                Machine.coffeeInMachine -= 12;
                                Machine.cupsInMachine -= 1;
                                Machine.moneyInMachine += 6;

                            }else if (cappuccinoWater > Machine.waterInMachine){
                                System.out.println("Sorry, not enough water");
                            }else if (cappuccinoBeans > Machine.coffeeInMachine){
                                System.out.println("Sorry, not enough coffee beans");
                            }else if (cappuccinoMilk > Machine.milkInMachine){
                                System.out.println("Sorry, not enough milk");
                            } else {
                                System.out.println("Sorry, not enough cups");
                            }
                            break;
                    }
                    System.out.println("Write action (buy, fill, take, remaining, exit)");
                    break;
                case "fill":
                    System.out.println();
                    System.out.println("Write how many ml of water you want to add: ");
                    int waterAdd = scanner.nextInt();
                    Machine.waterInMachine += waterAdd;
                    System.out.println("Write how many ml of milk you want to add: ");
                    int milkAdd = scanner.nextInt();
                    Machine.milkInMachine += milkAdd;
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    int coffeeAdd = scanner.nextInt();
                    Machine.coffeeInMachine += coffeeAdd;
                    System.out.println("Write how many disposable cups you want to add: ");
                    int cupsAdd = scanner.nextInt();
                    Machine.cupsInMachine += cupsAdd;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit)");
                    break;
                case "take":
                    System.out.println();
                    System.out.println("I gave you $" + Machine.moneyInMachine);
                    Machine.moneyInMachine = 0;
                    //Machine.showProducts(Machine);
                    System.out.println("Write action (buy, fill, take, remaining, exit)");
                    break;
                case "remaining":
                    Machine.showProducts(Machine);
                    System.out.println("Write action (buy, fill, take, remaining, exit)");
                    break;
                case "exit":
                    System.exit(0);
                    break;
            }
        } while (!action.equals("exit"));
    }
}
