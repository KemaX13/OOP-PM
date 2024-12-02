package org.factoria;

import org.factoria.LobotomyCorporation.Abnormality;
import org.factoria.LobotomyCorporation.Sephirot.Malkuth;

public class Main {
    public static void main(String[] args) {
        Malkuth malkuth = new Malkuth("Malkuth", "2X", "Sephirah", "cheerful, enthusiastic and somewhat impatient, with a clumsy demeanor.");
        Abnormality skullBro = new Abnormality("One Sin and Hundreds of Good Deeds", "Unknown", "Religious", "Unknown", "Zayin", new String[]{"Attachment"}, new String[]{"Insight"}, new String[]{"Instinct",  "Repression"});

        while (!malkuth.getIsCoreSuppressed()) {
            System.out.println("Please suppressed the sephirah core.");
            malkuth.CoreSuppressions();
        }

        malkuth.fullDescription();
        System.out.println("..............................................");
        skullBro.fullDescription();
    }
}