package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int neededWater = 200;
        int neededMilk = 50;
        int neededBeans = 15;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int waterInMachine = scanner.nextInt(); // ilosc wody w maszynie
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkInMachine = scanner.nextInt(); // ilosc mleka w maszynie
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beansInMachine = scanner.nextInt(); // ilosc kawy w maszynie
        System.out.println("Write how many cups of coffee you will need: ");
        int coffeeNeeded = scanner.nextInt();

        int waterToDo = coffeeNeeded * 200;     //woda potrzebna do zrobienia wybranej ilości kaw
        int milkToDo = coffeeNeeded * 50;       //mleko potrzebne do zrobienia wybranej ilości kaw
        int beansToDo = coffeeNeeded * 15;      //kawa potrzebna do zrobienia wybranej ilości kaw

        int waterLeft = waterInMachine - waterToDo; //ilość wody, która pozostała w maszynie
        int milkLeft = milkInMachine - milkToDo;    //ilość mleka, która pozostała w maszynie
        int beansLeft = beansInMachine - beansToDo; //ilość kawy, która pozostała w maszynie

        int starczyWody = waterLeft / neededWater;     //wody wystarczy na zrobienie JESZCZE x kaw
        int starczyMleka = milkLeft / neededMilk;      //mleka wystarczy na zrobienie JESZCZE x kaw
        int starczyKawy = beansLeft / neededBeans;     //kawy wystarczy na zrobienie JESZCZE x kaw

        int canDoWater = waterInMachine / neededWater;  //
        int canDoMilk = milkInMachine / neededMilk;     //mozna zrobić x kaw z zasobów w maszynie
        int canDoBeans = beansInMachine / neededBeans;  //

        if(waterInMachine >= waterToDo && milkInMachine >= milkToDo && beansInMachine >= beansToDo){
            if(canDoWater == coffeeNeeded || canDoMilk == coffeeNeeded || canDoBeans == coffeeNeeded){
                System.out.println("Yes, I can make that amount of coffee");
            } else if(starczyWody != waterToDo && starczyMleka != milkToDo && starczyKawy != beansToDo) {
                int najmniejsza = Math.min(starczyWody,starczyMleka);
                if (najmniejsza == starczyWody){
                    najmniejsza = Math.min(starczyWody,starczyKawy);
                }else if(najmniejsza == starczyMleka){
                    najmniejsza = Math.min(starczyMleka,starczyKawy);
                }
                System.out.println("Yes, I can make that amount of coffee (and even " + najmniejsza + " more than that)");
            }
        }
        else if (waterToDo > waterInMachine || milkToDo > milkInMachine || beansToDo > beansInMachine)
        {
            int minVal = canDoWater;
            if (starczyWody != coffeeNeeded && starczyMleka != coffeeNeeded && starczyKawy != coffeeNeeded) {
                if (canDoMilk < minVal) {
                    minVal = canDoMilk;
                } else if (canDoBeans < minVal) {
                    minVal = canDoBeans;
                }
                System.out.println("No, I can make only " + minVal + " cup(s) of coffee(s)");
            }
        }
    }
}