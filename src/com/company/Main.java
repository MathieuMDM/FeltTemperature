package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius " +
                "between -50ºC and 5ºF: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in km per hour: ");
        double speed = scanner.nextDouble();

        double wind = 13.12 + 0.6215 * temperature - 11.37 * Math.pow(speed, 0.16) + 0.3965 * temperature * Math.pow(speed, 0.16);

        System.out.println("The temperature felt is " + wind);
    }
}
