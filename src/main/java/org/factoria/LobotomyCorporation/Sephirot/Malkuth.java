package org.factoria.LobotomyCorporation.Sephirot;

import org.factoria.LobotomyCorporation.Sephirah;

import java.util.Random;
import java.util.Scanner;

public class Malkuth extends Sephirah {
    public Malkuth(String name, String age, String category, String personality) {
        super(name, age, category, personality);
    }

    @Override
    public void CoreSuppressions() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(5) + 1;
        int userGuess = 0;

        System.out.println("To suppress the core guess the number from 1 to 5.");

        while (userGuess != numberToGuess) {
            System.out.print("Number: ");
            userGuess = scanner.nextInt();

            if (userGuess < 1 || userGuess > 5) {
                System.out.println("Please enter a number between 1 and 5.");
            } else if (userGuess != numberToGuess) {
                System.out.println("Try again.");
            } else {
                System.out.println("Core suppress.........................");
                this.setCoreSuppressed();
            }
        }

        scanner.close();
    }
}
