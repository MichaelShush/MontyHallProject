import java.util.Scanner;

public class MontyHallRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        MontyHall doorOne = new MontyHall();
        MontyHall doorTwo = new MontyHall();
        MontyHall doorThree = new MontyHall();

        //sets which door has the car
        int rando = (int)(Math.random() * 3 + 1);
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
        System.out.print("Which door do you think the car is behind? Enter 1, 2, or 3: ");
        int chosen = scan.nextInt();

        String chosenDoor;
        if (chosen == 1){
            doorOne.setChosen();
            chosenDoor = "1";
        } else if (chosen == 2){
            doorTwo.setChosen();
            chosenDoor = "2";
        } else {
            doorThree.setChosen();
            chosenDoor = "3";
        }

        if (!(doorOne.hasCar() || doorOne.isChosen())){
            doorOne.setOpened();
            System.out.println("One of the goats is behind door number 1.");
        } else if (!(doorTwo.hasCar() || doorTwo.isChosen())){
            doorTwo.setOpened();
            System.out.println("One of the goats is behind door number 2.");
        } else{
            doorThree.setOpened();
            System.out.println("One of the goats is behind door number 3.");
        }

        System.out.print("Would you like to switch your guess? (y/n) ");
        scan.nextLine();
        String switchGuess = scan.nextLine();

        if (switchGuess.equals("y")){
            if (!(doorOne.isChosen() || doorOne.isOpened())){
                System.out.println("Guess switched from door " + chosenDoor + " to door 1.");
                if (doorOne.hasCar()){
                    System.out.println("Congratulations! You got the car!");
                } else{
                    System.out.println("Unlucky, you didn't get the car, which was behind door number" + chosenDoor + ".");
                }
            } else if (!(doorTwo.isChosen() || doorTwo.isOpened())){
                System.out.println("Guess switched from door " + chosenDoor + " to door 2.");
                if (doorTwo.hasCar()){
                    System.out.println("Congratulations! You got the car!");
                } else{
                    System.out.println("Unlucky, you didn't get the car, which was behind door number " + chosenDoor + ".");
                }
            } else{
                System.out.println("Guess switched from door " + chosenDoor + " to door 3.");
                if (doorThree.hasCar()){
                    System.out.println("Congratulations! You got the car!");
                } else{
                    System.out.println("Unlucky you didn't get the car, which was behind door number " + chosenDoor);
                }
            }
        } else{
            if (doorOne.isChosen() && !doorOne.hasCar()){
                System.out.println("Unlucky you didn't get the car, which was behind door " + rando + ".");
            } else if (doorTwo.isChosen() && !doorTwo.hasCar()){
                System.out.println("Unlucky you didn't get the car, which was behind door " + rando + ".");
            } else if (doorThree.isChosen() && !doorThree.hasCar()){
                System.out.println("Unlucky you didn't get the car, which was behind door " + rando + ".");
            } else{
                System.out.println("Congratulations! You got the car!");
            }
        }
    }
}