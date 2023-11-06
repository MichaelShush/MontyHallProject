import java.util.Scanner;

public class MontyHallRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        MontyHall doorOne = new MontyHall();
        MontyHall doorTwo = new MontyHall();
        MontyHall doorThree = new MontyHall();

        //sets which door has the car
        int rando = (int)(Math.random() * 4 + 1);
        if (rando == 1){
            doorOne.setHasCar();
        } else if (rando == 2){
            doorTwo.setHasCar();
        } else{
            doorThree.setHasCar();
        }

        System.out.println("Hello, and welcome to the Monty Hall game!");
        System.out.println();
        System.out.println("There are three doors, two containing a goat, and one containing a car!");
        System.out.print("Which door do you think the car is? Enter 1, 2, or 3: ");
        int chosen = scan.nextInt();

        if (chosen == 1){
            doorOne.setChosen();
        } else if (chosen == 2){
            doorTwo.setChosen();
        } else {
            doorThree.setChosen();
        }

    }
}