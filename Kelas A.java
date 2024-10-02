

    /*
    ==================================

        Muhammad Idham Ma'arif
             Anak Tekkom <3

    ==================================

     */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int hariA = scanner.nextInt();
        String bulanA = scanner.next();
        int jamA = scanner.nextInt();
        int menitA = scanner.nextInt();
        
        int hariB = scanner.nextInt();
        String bulanB = scanner.next();
        int jamB = scanner.nextInt();
        int menitB = scanner.nextInt();
        
        int daysA = convertToDays(hariA, bulanA);
        int daysB = convertToDays(hariB, bulanB);
        
        int totalMinutesA = (daysA * 24 * 60) + (jamA * 60) + menitA;
        int totalMinutesB = (daysB * 24 * 60) + (jamB * 60) + menitB;
        
        int diffMinutes = totalMinutesB - totalMinutesA;
        
        int diffDays = diffMinutes / (24 * 60);
        diffMinutes %= (24 * 60);

        int diffHours = diffMinutes / 60;
        diffMinutes %= 60;
        
        System.out.printf("%dd %dh %dm%n", diffDays, diffHours, diffMinutes);

        scanner.close();
    }
    
    public static int convertToDays(int day, String month) {
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        String[] monthNames = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
        int monthIndex = 0;
        
        for (int i = 0; i < monthNames.length; i++) {
            if (month.equalsIgnoreCase(monthNames[i])) {
                monthIndex = i;
                break;
            }
        }
        
        int totalDays = 0;
        for (int i = 0; i < monthIndex; i++) {
            totalDays += daysInMonths[i];
        }
        
        totalDays += day;

        return totalDays;
    }
}
