package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSumTotal() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSumTotal(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateSumAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateSumAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findSumMax() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 20;
        int actual = service.findSumMax(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findSumMin() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        int actual = service.findSumMin(purchases);
        assertEquals(expected, actual);
    }

}