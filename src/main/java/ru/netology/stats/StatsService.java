package ru.netology.stats;

public class StatsService {

    public int calculateSumTotal(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int calculateSumAverage(int[] purchases) {
        int sum = 0;
        int months = 12;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum / months;
    }

    public int findSumMax(int[] purchases) {
        int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int month = 0;
        for (int value: values) {
            month ++;
        }
        int currentMax = purchases[0];
        for (int purchase : purchases) {
            if (currentMax <= purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
    }
    public int findSumMin(int[] purchases) {
        int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int month = 0;
        for (int value: values) {
            month ++;
        }
        int currentMin = purchases[0];
        for (int purchase : purchases) {
            if (currentMin >= purchase) {
                currentMin = purchase;
            }
        }
        return currentMin;
    }
}

