package statistics;

public class StatisticalWork {

    public int calculateService(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public int calculateAverage(int[] sales) {
        return calculateService(sales) / sales.length;
    }

    public int findMaxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public int findMinMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findPurchasesBelowTheAverage(int[] sales) {
        int months = 0;
        int calculateAverage = calculateService(sales) / sales.length;
        for (int sale : sales) {
            if (sale < calculateAverage) {
                months = months + 1;
            }

        }
        return months;
    }

    public int findPurchasesAboveTheAverage(int[] sales) {
        int months = 0;
        int calculateAverage = calculateService(sales) / sales.length;
        for (int sale : sales) {
            if (sale > calculateAverage) {
                months = months + 1;
            }

        }
        return months;
    }
}