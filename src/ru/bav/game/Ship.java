package ru.bav.game;

import java.util.ArrayList;

public class Ship {
    private ArrayList<String> location;

    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }

    public ArrayList<String> getLocation() {
        return location;
    }

    public String checkShip(String shot) {
        String result = "Мимо";

        int index = location.indexOf(shot);

        if (index == -1) {
            result = "Мимо";
        }
        if (index != -1) {
            result = "Ранил";
            location.remove(index);
        }
        if (location.isEmpty()) {
            result = "Потопил";
        }
        return result;

    }

    @Override
    public String toString() {
        return "Корабль:" +
                " Местоположение = " + location;
    }
}
