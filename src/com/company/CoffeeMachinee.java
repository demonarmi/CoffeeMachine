package com.company;

import java.util.Scanner;

public class CoffeeMachinee {
    int waterInMachine;
    int milkInMachine;
    int coffeeInMachine;
    int cupsInMachine;
    int moneyInMachine;
    final int espressoWater = 250;
    final int espressoBeans = 16;
    final int latteWater = 350;
    final int latteMilk = 75;
    final int latteBeans = 20;
    final int cappuccinoWater = 200;
    final int cappuccinoMilk = 100;
    final int cappuccinoBeans = 12;
    String action;

    public void setAction(String s) {
        this.action = s;
    }

    public void processInputCommands(CoffeeMachinee CF){
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit)");
        CF.setAction(scanner.nextLine());
    }

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

    public void buy(CoffeeMachinee CF) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("What do You want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
        String menu = scanner.next();
        switch (menu)
        {
            case "1":
                if (espressoWater <= CF.waterInMachine && espressoBeans <= CF.coffeeInMachine && CF.cupsInMachine >= 1){
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println();
                    CF.waterInMachine -= 250;
                    CF.coffeeInMachine -= 16;
                    CF.cupsInMachine -= 1;
                    CF.moneyInMachine += 4;

                }else if (espressoWater > CF.waterInMachine){
                    System.out.println("Sorry, not enough water");
                    System.out.println();
                }else if (espressoBeans > CF.coffeeInMachine){
                    System.out.println("Sorry, not enough coffee beans");
                    System.out.println();
                }else {
                    System.out.println("Sorry, not enough cups");
                    System.out.println();
                }
                break;
            case "2":
                if (latteWater <= CF.waterInMachine && latteMilk <= CF.milkInMachine && latteBeans <= CF.coffeeInMachine && CF.cupsInMachine >=1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    CF.waterInMachine -= 350;
                    CF.milkInMachine -= 75;
                    CF.coffeeInMachine -= 20;
                    CF.cupsInMachine -= 1;
                    CF.moneyInMachine += 7;
                    System.out.println();
                }else if (latteWater > CF.waterInMachine){
                    System.out.println("Sorry, not enough water");
                    System.out.println();
                }else if (latteBeans > CF.coffeeInMachine){
                    System.out.println("Sorry, not enough coffee beans");
                    System.out.println();
                }else if (latteMilk > CF.milkInMachine){
                    System.out.println("Sorry, not enough milk");
                    System.out.println();
                } else {
                    System.out.println("Sorry, not enough cups");
                    System.out.println();
                }
                break;
            case "3":
                if (cappuccinoWater <= CF.waterInMachine && cappuccinoMilk <= CF.milkInMachine && cappuccinoBeans <= CF.coffeeInMachine && CF.cupsInMachine >=1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    CF.waterInMachine -= 200;
                    CF.milkInMachine -= 100;
                    CF.coffeeInMachine -= 12;
                    CF.cupsInMachine -= 1;
                    CF.moneyInMachine += 6;
                }else if (cappuccinoWater > CF.waterInMachine){
                    System.out.println("Sorry, not enough water");
                }else if (cappuccinoBeans > CF.coffeeInMachine){
                    System.out.println("Sorry, not enough coffee beans");
                }else if (cappuccinoMilk > CF.milkInMachine){
                    System.out.println("Sorry, not enough milk");
                } else {
                    System.out.println("Sorry, not enough cups");
                }
                break;
        }
    }

    public void fill(CoffeeMachinee CF) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Write how many ml of water you want to add: ");
        int waterAdd = scanner.nextInt();
        CF.waterInMachine += waterAdd;
        System.out.println("Write how many ml of milk you want to add: ");
        int milkAdd = scanner.nextInt();
        CF.milkInMachine += milkAdd;
        System.out.println("Write how many grams of coffee beans you want to add: ");
        int coffeeAdd = scanner.nextInt();
        CF.coffeeInMachine += coffeeAdd;
        System.out.println("Write how many disposable cups you want to add: ");
        int cupsAdd = scanner.nextInt();
        CF.cupsInMachine += cupsAdd;
        System.out.println();
    }

    public void take(CoffeeMachinee CF) {
        System.out.println();
        System.out.println("I gave you $" + CF.moneyInMachine);
        CF.moneyInMachine = 0;
    }

    public void remaining(CoffeeMachinee CF) {
        CF.showProducts(CF);
    }

    public void exit(CoffeeMachinee CF) {
        System.exit(0);
    }
}
