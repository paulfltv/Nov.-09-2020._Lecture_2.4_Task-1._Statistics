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


	public int numberMonthSumMax(int[] purchases) {
		int sumMax = purchases[0];
		for (int purchase : purchases) {
			if (sumMax < purchase) {
				sumMax = purchase;
			}
		}
		int month = 0;
		int numberMonthSumMax = 0;
		for (int purchase : purchases) {
			month++;
			if (sumMax == purchase) {
				numberMonthSumMax = month;
			}
		}
		return numberMonthSumMax;
	}

	public int numberMonthSumMin(int[] purchases) {
		int sumMin = getSumMin(purchases);
		int month = 0;
		int numberMonthSumMin = 0;
		for (int purchase : purchases) {
			month++;
			if (sumMin == purchase) {
				numberMonthSumMin = month;
			}
		}
		return numberMonthSumMin;
	}

	public int getSumMin(int[] purchases) {
		int sumMin = purchases[0];
		for (int purchase : purchases) {
			if (sumMin > purchase) {
				sumMin = purchase;
			}
		}
		return sumMin;
	}


	public int saleAboveSumAverage(int[] purchases) {
		int sumAverage = calculateSumAverage(purchases);
		int quantity = 0;
		for (int purchase : purchases) {
			if (sumAverage < purchase) {
				quantity++;
			}
		}
		return quantity;
	}

	public int saleBelowSumAverage(int[] purchases) {
		int sumAverage = calculateSumAverage(purchases);
		int quantity = 0;
		for (int purchase : purchases) {
			if (sumAverage > purchase) {
				quantity++;
			}
		}
		return quantity;
	}
}