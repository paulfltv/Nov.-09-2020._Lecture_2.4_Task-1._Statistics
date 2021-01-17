package ru.netology.stats;

public class Stats {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int actual = service.calculateSumTotal(purchases);
        int expected = actual;
        System.out.println(expected);
    }
}