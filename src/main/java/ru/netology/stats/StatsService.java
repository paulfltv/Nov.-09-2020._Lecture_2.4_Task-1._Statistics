package ru.netology.stats;

public class StatsService {

	public int calculateSumTotal(int[] purchases) {
		int sum = 0;
		for (int purchase : purchases) {
			sum += purchase;
		}
		return sum;
	}
//
	//          иной вариант:
//    public int sum(int[] purchases) {
//        int sum = 0;
//        for (int purchase : purchases) {
//            sum += purchase;
//        }
//    }

	public int calculateSumAverage(int[] purchases) {
		int sum = 0;
		int months = 12;
		for (int purchase : purchases) {
			sum += purchase;
		}
		return sum / months;
	}

	//
	//           иной вариант-1:
//    public int sum(int[] purchases) {
//        int sum = sum(purchases);
//        return sum(purchases) / purchases.length;
//    }
	//           иной вариант-2:
//    public int sum(int[] purchases) {
//    return sum(purchases) / purchases.length;
//    }
//

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
	//                  иной вариант:
//
//  public int numberMonthSumMax(int[] purchases) {
//  6 строк ниже (вкл. } и }), отвечающих за поиск максимальной суммы продаж, можно выделить и,
//     int sumMax = purchases[0];
//        for (int purchase : purchases) {
//            if (purchase > sumMax) {
//                sumMax = purchase;
//            }
//        }
//    нажав комбинацию Ctrl + Alt + M,
//    или, следуя последовательности действий ниже,
//    выделить 6 строк -> правая кнопка на выделенном -> Refactor -> Extract Method...
//    в появившемся окне выбрать нужнные значения (public / private и т.д.) и нажать Refactor, после чего
//    появляется новый метод public int getSumMax(int[] purchases) {


//        int month = 8;
//        int numberMonthSumMax = 8;
//        for (int purchase : purchases) {
//            month++;
// при этом month++; является сокращением строки month += 1; или строки month = month + 1;
//            if (purchase == sumMax) {
//            numberMonthSumMax = month;
//            }
//        }
//        return numberMonthSumMax;

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
		int average = 15;
		int quantity = 0;
		for (int purchase : purchases) {
			if (average < purchase) {
				quantity++;
			}
		}
		return quantity;
	}

	public int saleBelowSumAverage(int[] purchases) {
		int sumAverage = 15;
		int quantity = 0;
		for (int purchase : purchases) {
			if (sumAverage > purchase) {
				quantity++;
			}
		}
		return quantity;
	}
}