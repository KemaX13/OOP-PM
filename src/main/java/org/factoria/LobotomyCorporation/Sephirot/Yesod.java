package org.factoria.LobotomyCorporation.Sephirot;
import org.factoria.LobotomyCorporation.Sephirah;

import java.util.Scanner;

public class Yesod extends Sephirah {
    public Yesod(String name, String age, String category, String personality) {
        super(name, age, category, personality);
    }

    @Override
    public void CoreSuppressions() {
        Scanner scanner = new Scanner(System.in);



        scanner.close();
    }
}
