package ru.job4j.inheritance;

public class Doctor extends Profession {
    private float experience;
    private String diagnose;
    private boolean heal;

    public String Diagnose() {
        return diagnose;
    }

    public boolean Heal() {
        return heal;
    }

}
