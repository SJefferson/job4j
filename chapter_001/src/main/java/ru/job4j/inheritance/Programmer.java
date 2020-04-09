package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private int Experiance;
    private String Lang;

    public String getLang(){
        return Lang;
    }

    public int getExperiance(){
        return Experiance;
    }

}
