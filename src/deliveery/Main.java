package deliveery;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static int sum = 0;

    public static void main(String[] args) {
        Map<Address, Integer> costPerAddress = new HashMap<>();
        HashSet<String> hashSetCountry = new HashSet<>();
        Address address1 = new Address("Russia", "MSK");
        Address address2 = new Address("Russia", "SPB");
        Address address3 = new Address("China", "PKN");
        Address address4 = new Address("Italy", "ROME");
        Address address5 = new Address("France", "PRS");
        costPerAddress.put(address1, 50);
        costPerAddress.put(address2, 60);
        costPerAddress.put(address3, 100);
        costPerAddress.put(address4, 700);
        costPerAddress.put(address5, 600);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Заполнение нового заказа.");
            System.out.print("Введите страну: ");
            String country = scanner.nextLine();
            System.out.print("Введите город: ");
            String city = scanner.nextLine();
            System.out.print("Введите вес (кг): ");
            int weight = Integer.parseInt(scanner.nextLine());
            costOfDelivery(new Address(country, city), costPerAddress, hashSetCountry, weight);
            System.out.println("Введите end для завершения или любой другой символ для продолжения");
            String end = scanner.nextLine();
            if (end.equals("end")) {
                break;
            }
        }
    }

    public static void costOfDelivery(Address address, Map<Address, Integer> costPerAddress, HashSet<String> hashSetCountry, int weight) {
        if (costPerAddress.get(address) != null) {
            int cost = costPerAddress.get(address) * weight;
            sum += cost;
            hashSetCountry.add(address.getCountry());
            System.out.printf("Стоимость доставки составит: %d руб.", cost);
            System.out.println();
            System.out.printf("Общая стоимость всех доставок: %d руБ", sum);
            System.out.println();
            System.out.printf("количество уникальных стран: %d", hashSetCountry.size());
            System.out.println();
        } else {
            System.out.println("Доставки по этому адресу нет");
        }
    }
}
