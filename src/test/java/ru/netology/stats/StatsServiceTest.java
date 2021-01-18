package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

	@Test
	void calculateSumTotal() {
		StatsService service = new StatsService();
		int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//
//        чтобы много раз не указывать в других тестах строки
//        StatsService service = new StatsService();
//        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//        их можно вывести наверх (для всех тестов, где они нужны), указав под class StatsServiceTest {
//        private StatsService service = new StatsService();
//        private int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//        после чего эти строки можно удалить из тестов, т.к. они уже будут вверху
//
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
	void numberMonthSumMax() {
		StatsService service = new StatsService();
		int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
		int expected = 8;
		int actual = service.numberMonthSumMax(purchases);
		assertEquals(expected, actual);
	}

	@Test
	void numberMonthSumMin() {
		StatsService service = new StatsService();
		int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
		int expected = 9;
		int actual = service.numberMonthSumMin(purchases);
		assertEquals(expected, actual);
	}


	@Test
	void quantityMonthsSaleAboveSumAverage() {
		StatsService service = new StatsService();
		int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
		int expected = 5;
		int actual = service.saleAboveSumAverage(purchases);
		assertEquals(expected, actual);
	}

	@Test
	void quantityMonthsSaleBelowSumAverage() {
		StatsService service = new StatsService();
		int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
		int expected = 5;
		int actual = service.saleBelowSumAverage(purchases);
		assertEquals(expected, actual);
	}
}