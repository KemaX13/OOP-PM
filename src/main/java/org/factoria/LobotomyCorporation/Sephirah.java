package org.factoria.LobotomyCorporation;

public abstract class Sephirah extends Character {
    private boolean isCoreSuppressed = false;

    public Sephirah(String name, String age, String category, String personality) {
        super(name, age, category, personality);
    }

    public boolean getIsCoreSuppressed() {
        return isCoreSuppressed;
    }

    public void setCoreSuppressed() {
        isCoreSuppressed = true;
    }

    public abstract void CoreSuppressions();
}
