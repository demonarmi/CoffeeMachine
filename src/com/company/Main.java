package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        class CoffeeMachine {
            int waterInMachine;
            int milkInMachine;
            int coffeeInMachine;
            int cupsInMachine;
            int moneyInMachine;
            public void showProducts(CoffeeMachine CF){
                System.out.println("The coffee machine has: ");
                System.out.println(CF.waterInMachine + " of water");
                System.out.println(CF.milkInMachine + " of milk");
                System.out.println(CF.coffeeInMachine + " of coffee beans");
                System.out.println(CF.cupsInMachine + " disposable cups");
                System.out.println(CF.moneyInMachine + " of money");
            }
        }
        CoffeeMachine Machine = new CoffeeMachine();
        Machine.waterInMachine = 400;
        Machine.milkInMachine = 540;
        Machine.coffeeInMachine = 120;
        Machine.cupsInMachine = 9;
        Machine.moneyInMachine = 550;


        Scanner scanner = new Scanner(System.in);
        String action;
        Machine.showProducts(Machine);

        System.out.println("Write action (buy, fill, take)");
        action = scanner.nextLine();


        switch (action){
            case "buy":
                System.out.println("What do You want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
                String menu = scanner.nextLine();
                switch (menu){
                    case "1":
                        System.out.println("Doing espresso...");
                        Machine.waterInMachine -= 250;
                        Machine.coffeeInMachine -= 16;
                        Machine.cupsInMachine -= 1;
                        Machine.moneyInMachine += 4;
                        Machine.showProducts(Machine);
                        break;
                    case "2":
                        System.out.println("Doing latte...");
                        Machine.waterInMachine -= 350;
                        Machine.milkInMachine -= 75;
                        Machine.coffeeInMachine -= 20;
                        Machine.cupsInMachine -= 1;
                        Machine.moneyInMachine += 7;
                        Machine.showProducts(Machine);
                        break;
                    case "3":
                        System.out.println("Doing cappuccino...");
                        Machine.waterInMachine -= 200;
                        Machine.milkInMachine -= 100;
                        Machine.coffeeInMachine -= 12;
                        Machine.cupsInMachine -= 1;
                        Machine.moneyInMachine += 6;
                        Machine.showProducts(Machine);
                        break;
                }
                break;
            case "fill":
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
                Machine.showProducts(Machine);
                break;

            case "take":
                System.out.println("I gave you $" + Machine.moneyInMachine);
                Machine.moneyInMachine = 0;
                Machine.showProducts(Machine);
                break;

        }
    }
}
