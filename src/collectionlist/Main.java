package collectionlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();
        while (true) {
            showActions();
            System.out.print("Ваш выбор: ");
            int a = Integer.parseInt(scanner.nextLine());
            if (a == 0) {
                System.out.println("Программа заверщена");
                break;
            } else {
                switch (a) {
                    case 1:
                        System.out.print("Введите название задачи:");
                        String business = scanner.nextLine();
                        toDoList.add(business);
                        System.out.println("Добавлено!");
                        System.out.println();
                        showBusiness(toDoList);
                        break;
                    case 2:
                        showBusiness(toDoList);
                        break;

                    case 3:
                        System.out.print("Введите номер для удаления: ");
                        int number = Integer.parseInt(scanner.nextLine());
                        if (number > toDoList.size()) {
                            System.out.println("Такого дела нет в списке");
                            System.out.println();
                            break;
                        } else {
                            toDoList.remove(number - 1);
                            System.out.println("Удалено");
                            showBusiness(toDoList);
                            break;
                        }
                    case 4:
                        System.out.print("Введите задачу для удаления: ");
                        String input = scanner.nextLine();
                        if (toDoList.contains(input)) {
                            toDoList.remove(input);
                            showBusiness(toDoList);
                            ;
                            break;
                        } else {
                            System.out.println("Такого дела нет в списке");
                            System.out.println();
                            break;
                        }
                    case 5:
                        System.out.print("введите ключевое слово для ужаления: ");
                        String word = scanner.nextLine();
                        removeForWord(toDoList, word);
                        showBusiness(toDoList);
                        break;
                }
            }

        }
    }

    public static void showActions() {
        System.out.println("Выберите операцию:\n" +
                "0.Выход из программы\n" +
                "1. Добавить дело\n" +
                "2. Показать дела\n" +
                "3. Удалить дело по номеру\n" +
                "4. Удалить дело по названию\n" +
                "5. Удалить дела по ключевому слову");
    }

    public static void showBusiness(ArrayList<String> toDoList) {
        System.out.println("Выш список дел:");
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.printf("%d. %s", i + 1, toDoList.get(i));
            System.out.println();
        }
        System.out.println();
    }

    public static void removeForWord(ArrayList<String> toDoList, String word) {
        String[] array = toDoList.toArray(new String[0]);
        for (String deal : array) {
            if (deal.contains(word)) {
                toDoList.remove(deal);
            }
        }
        if (toDoList.size() == array.length) {
            System.out.println("Такого ключевого слова в списке дел нету.");
        } else {
            System.out.println("Удаление завершено!");
        }
    }
}

