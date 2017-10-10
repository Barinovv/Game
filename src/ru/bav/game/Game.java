package ru.bav.game;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Класс для задания местоположения корабля и выстрела в него.
 *
 * @author Barinov Anton 1518
 */

public class Game {
    public static void main(String[] args) {
        ArrayList<String> localOfShip = new ArrayList<>();
        randomLocational(localOfShip);
        Ship ship = new Ship();
        ship.setLocation(localOfShip);
        int attempt = 1;
        while (!ship.getLocation().isEmpty()) {
            System.out.println(ship.checkShip(scan()));
            System.out.println("Вы использовали попыток - " + attempt++ );
        }
    }

    /**
     * Метод для задания местоположения корабля с помощью рандома
     *
     * @param locational - хранит месторасположение корабля
     */
    public static void randomLocational(ArrayList<String> locational) {
        locational.add(String.valueOf((int) ((Math.random() * 4))));
        locational.add(String.valueOf(Integer.parseInt(locational.get(0)) + 1));
        locational.add(String.valueOf(Integer.parseInt(locational.get(1)) + 1));

    }

    /**
     * Метод для ввода координаты выстрела в корабль.
     *
     * @return - возвращает введеную пользоватем координату выстрела.
     */
    public static String scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату выстрела от 0 до 6: ");
        int shoot = scanner.nextInt();
        return String.valueOf(shoot);
    }
}

