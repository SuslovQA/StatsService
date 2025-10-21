package org.example.stats.service;

public class statsService {
//    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int sumSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        return sum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int avgSales(long[] sales) {
        int countMonths = 0;
        int avg;
        for (int i = 0; i < sales.length; i++) {
            if (i < sales.length) {
                countMonths++;
            }
        }
        return avg = sumSales(sales) / countMonths;
    }

    public int countOfMonthsWithMinSales(long[] sales) {
        int avg = avgSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                count++;
            }
        }
        return count;
    }


    public int countOfMonthWithMaxSales(long[] sales) {
        int avg = avgSales(sales);
        int count = 0;
//        for (int i = 0; i < sales.length; i++) {
//            if (sales[i] > avg) {
//                count++;
//            }
//        }
//        return count;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}