package com.sihab;
import java.util.Scanner;

import java.util.Scanner;




public class MonthTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days in the month: ");
        int numDays = scanner.nextInt();

        double[] temperatures = new double[numDays];
        double sum = 0;
        double hottestDay = Double.MIN_VALUE;
        double coolestDay = Double.MAX_VALUE;
        int hottestDayIndex = 0;
        int coolestDayIndex = 0;

        System.out.println("Enter the temperature of the mid-day for each day:");
        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
            sum += temperatures[i];

            if (temperatures[i] > hottestDay) {
                hottestDay = temperatures[i];
                hottestDayIndex = i;
            }

            if (temperatures[i] < coolestDay) {
                coolestDay = temperatures[i];
                coolestDayIndex = i;
            }
        }

        double averageTemperature = sum / numDays;

        System.out.println("Average temperature: " + averageTemperature);
        System.out.println("Hottest day: Day " + (hottestDayIndex + 1) + " with " + hottestDay + "°C");
        System.out.println("Coolest day: Day " + (coolestDayIndex + 1) + " with " + coolestDay + "°C");
    }
}




    }

}

