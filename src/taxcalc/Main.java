package taxcalc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int earnings = 0;
        int spendings = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать систему налогообложения");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Программа завершена!");
                break;
            } else {
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        System.out.println("Введите сумму дохода:");
                        String moneyStr = scanner.nextLine();
                        int money = Integer.parseInt(moneyStr);
                        earnings += money;
                        break;
                    case 2:
                        System.out.println("Введите сумму расхода:");
                        String moneySpendingsStr = scanner.nextLine();
                        int moneySpendings = Integer.parseInt(moneySpendingsStr);
                        spendings += moneySpendings;
                        break;
                    case 3:
                        int taxMinus = taxEarningsMinusSpendings(earnings, spendings);
                        int taxEarnings = taxEarnings(earnings);
                        if (taxMinus > taxEarnings) {
                            System.out.println("Мы советуем вам УСН доходы\n" +
                                    "Ваш налог составит: " + taxEarnings + " рублей\n" +
                                    "Налог на другой системе: " + taxMinus + " рублей\n" +
                                    "Экономия: " + (taxMinus - taxEarnings) + " рублей");
                            break;
                        } else if (taxMinus == taxEarnings) {
                            System.out.println("Вы можете выбрать любую систему налогообложения\n" +
                                    "Ваш налог составит: " + taxEarnings + " рублей");
                            break;
                        } else {
                            System.out.println("Мы советуем вам УСН доходы минус расходы\n" +
                                    "Ваш налог составит: " + taxMinus + " рублей\n" +
                                    "Налог на другой системе: " + taxEarnings + " рублей\n" +
                                    "Экономия: " + (taxMinus - taxEarnings) + " рублей");
                            break;
                        }
                    default:
                        System.out.println("Такой операции нет");
                        break;
                }
            }
        }
    }

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    public static int taxEarnings(int earnings) {
        return earnings * 6 / 100;
    }
}
