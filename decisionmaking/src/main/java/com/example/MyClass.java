package com.example;

import java.util.Scanner;

public class MyClass {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        //What should I eat decision making process

        System.out.println("What do I want to eat?");
        System.out.println("1. Something healthy");
        System.out.println("2. Something not so healthy");

        int userChoice;

        userChoice = in.nextInt();

        while (userChoice > 2 || userChoice < 1)
        {
            System.out.println("Sorry that is not a valid choice, please enter a new choice: ");
            userChoice = in.nextInt();
        }

        switch(userChoice)
        {
            case 1:
                System.out.println("Select an item:");
                System.out.println("1. Chicken");
                System.out.println("2. Salad");
                System.out.println("3. Fish");

                userChoice = in.nextInt();

                while (userChoice > 3 || userChoice < 1)
                {
                    System.out.println("Sorry that is not a valid choice, please enter a new choice: ");
                    userChoice = in.nextInt();
                }

                switch (userChoice)
                {
                    case 1:
                        System.out.println("Grilled Chicken and Asparagus");
                        break;

                    case 2:
                        System.out.println("Caesar Salad, no crutons and water");
                        break;

                    case 3:
                        System.out.println("Grilled Salmon with lemon butter");
                        break;
                }
                break;

            case 2:
                System.out.println("Select an item:");
                System.out.println("1. Pizza");
                System.out.println("2. Burger");
                System.out.println("3. Wings");

                userChoice = in.nextInt();

                while (userChoice > 3 || userChoice < 1)
                {
                    System.out.println("Sorry that is not a valid choice, please enter a new choice: ");
                    userChoice = in.nextInt();
                }

                switch (userChoice)
                {
                    case 1:
                        System.out.println("Pizza and cheese sticks");
                        break;

                    case 2:
                        System.out.println("Burgers and fries");
                        break;

                    case 3:
                        System.out.println("Parmesan chicken wings from bdubs");
                        break;
                }
                break;



        }






    }

}