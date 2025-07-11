package producttask;

import java.util.Arrays;
import java.util.Scanner;

public class GroceryBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};
        int[] contOfProduct = new int[products.length];

        System.out.println("Список возможных товаров для покупки:");
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%d. %s %d руб/шт\n", i + 1, products[i], prices[i]);
        }
        while (true) {
            int productNumber = 0;
            int productPrice = 0;
            System.out.println("Выберите товар и количество или введите end");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                basket(contOfProduct, prices, products);
                break;
            } else {
                String[] choise = input.split(" ");
                productNumber = Integer.parseInt(choise[0]);
                if ((productNumber >= 1 && productNumber <= products.length) && Integer.parseInt(choise[1]) >= 1) {
                    contOfProduct[productNumber - 1] += Integer.parseInt(choise[1]);
                } else {
                    System.out.println("Неккоректный ввод, попробуйте снова");
                }
            }
        }
    }


    private static void basket(int[] contOfProduct, int[] prices, String[] products) {
        System.out.println("Ваша корзина:");
        int sum = 0;
        for (int i = 0; i < contOfProduct.length; i++) {
            if (contOfProduct[i] != 0) {
                sum += contOfProduct[i] * prices[i];
                System.out.printf("%s %d шт. %d руб/шт %d рублей в сумме\n", products[i], contOfProduct[i], prices[i], contOfProduct[i] * prices[i]);
            }
        }
        System.out.printf("Всего %d рублей", sum);
    }

}
