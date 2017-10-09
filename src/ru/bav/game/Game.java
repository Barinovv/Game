package ru.bav.game;

import java.util.ArrayList;
import java.util.Scanner;

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

    public static void randomLocational(ArrayList<String> locational) {
        locational.add(String.valueOf((int) ((Math.random() * 4))));
        locational.add(String.valueOf(Integer.parseInt(locational.get(0)) + 1));
        locational.add(String.valueOf(Integer.parseInt(locational.get(1)) + 1));

    }

    public static String scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату выстрела от 0 до 6: ");
        int shoot = scanner.nextInt();
        return String.valueOf(shoot);
    }
}

