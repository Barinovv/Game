package ru.bav.game;

import java.util.ArrayList;

/**
 * Класс для установления местоположения корабля и определения попадания в него.
 *
 * @author Barinov Anton 1518
 */
public class Ship {
    private ArrayList<String> location;

    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }

    public ArrayList<String> getLocation() {
        return location;
    }

    /**
     * Метод для установления попадания/промаха/потопления (в) корабль.
     *
     * @param shot переменная которая хранит ввденную пользователем координату выстрела.
     *
     * @return результат выстрела.
     */

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
