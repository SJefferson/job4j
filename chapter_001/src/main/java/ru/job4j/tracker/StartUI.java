package ru.job4j.tracker;

import javax.xml.transform.Result;

public class StartUI {

    public static void main(String[] args) {
        Tracker Rr = new Tracker();
        Item I = new Item();
        I.setId(1);
        I.setName("Павел");
        Rr.add(I);

        Item J = new Item();
        J.setId(2);
        J.setName("Василий");
        Rr.add(J);

        System.out.println(I);
        System.out.println(J);

        Item result = new Item();

        result = Rr.findByName("Василий");
        System.out.println();

        System.out.print(Rr.findById(2));

        }


}

