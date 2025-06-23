package loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.print("Введите год: ");
            int year = scanner.nextInt();
            System.out.print("Введите количество дней: ");
            int days = scanner.nextInt();
            if (isLeapYear(year)) {
                if (days == 366) {
                    count++;
                } else {
                    System.out.println("Неправильно! В этом году 366 дней!");
                    System.out.println("Набрано очков: " + count);
                    break;
                }
            } else {
                if (days == 365) {
                    count++;
                } else {
                    System.out.println("Неправильно! В этом году 365 дней!");
                    System.out.println("Набрано очков: " + count);
                    break;
                }
            }
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            return year % 4 == 0 && year % 100 != 0;
        }
    }
}
