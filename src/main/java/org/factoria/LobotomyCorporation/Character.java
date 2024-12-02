package org.factoria.LobotomyCorporation;

public class Character {
    protected final String name;
    protected final String age;

    protected final String category;
    protected final String personality;

    public Character(String name, String age, String category, String personality) {
        this.name = name;
        this.age = age;
        this.category = category;
        this.personality = personality;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getCategory() {
        return category;
    }

    public String getPersonality() {
        return personality;
    }

    public void fullDescription() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Category: " + category);
        System.out.println("Personality: " + personality);
    }
}
