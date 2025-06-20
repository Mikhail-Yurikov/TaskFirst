package ru.netology.sevice;

public class CustomsService {
    public static int TARIFF_PER_KILOGRAM = 100;

    public static int calculateCustoms(int price, int weight) {
        return price / 100 + weight * TARIFF_PER_KILOGRAM;
    }
}
