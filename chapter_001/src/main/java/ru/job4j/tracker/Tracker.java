package ru.job4j.tracker;
import java.util.Random;

public class Tracker {
    /*** Массив для хранения заявок.*/
    private final Item[] items = new Item[100];
    /*** Указатель ячейки для новой заявки.*/
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    public Item[] findByName(String key){
        Item FbN[] = null;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                FbN[index] = item;}
            }
        return FbN;
        }


    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }






}
