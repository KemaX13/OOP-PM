package org.factoria.LobotomyCorporation;

public class Abnormality extends Character{
    private final String riskLevel;
    private final String[] goodWorkFavor;
    private final String[] neutralWorkFavor;
    private final String[] badWorkFavor;

    public Abnormality(String name, String age, String category, String personality, String riskLevel, String[] goodWorkFavor, String[] neutralWorkFavor, String[] badWorkFavor) {
        super(name, age, category, personality);
        this.riskLevel = riskLevel;
        this.goodWorkFavor = goodWorkFavor;
        this.neutralWorkFavor = neutralWorkFavor;
        this.badWorkFavor = badWorkFavor;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public String[] getGoodWorkFavor() {
        return goodWorkFavor;
    }

    public String[] getNeutralWorkFavor() {
        return neutralWorkFavor;
    }

    public String[] getBadWorkFavor() {
        return badWorkFavor;
    }

    public void WorkFavor(String work) {
        if (containsWord(goodWorkFavor, work)) {
            System.out.println("Well done!");
        } else if (containsWord(neutralWorkFavor, work)) {
            System.out.println("That's... okay");
        } else if (containsWord(badWorkFavor, work)) {
            System.out.println("Wrong work");
        } else {
            System.out.println("?????? Try again");
        }
    }

    private boolean containsWord(String[] array, String word) {
        for (String str : array) {
            if (str.equalsIgnoreCase(word)) {
                return true;
            }
        }

        return false;
    }
}