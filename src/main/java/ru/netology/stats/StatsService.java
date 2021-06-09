package ru.netology.stats;

public class StatsService {

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

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            // аналог sum = sum + purchase;
            sum += sale;
        }
        return sum;
    }

    public long calculateAverage(long[] sales) {
        long sumForAverage = calculateSum(sales);   // переменная с суммой из метода calculateSum
        long average = sumForAverage / sales.length;
        return average;
    }

    public long monthAnderAverage(long[] sales) {
        long average = calculateAverage(sales);  // переменная со средней суммой из метода  calculateAverage
        int month = 0;                     // переменная для кол-ва месяцев с суммой меньше среднего
        for (long sale : sales) {
            if (sale < average) {
                month = month + 1;
            }
        }
        return month;
    }

    public long montAfterAverage(long[] sales) {
        long average = calculateAverage(sales);  // переменная со средней суммой из метода  calculateAverage
        int month = 0;                     // переменная для кол-ва месяцев с суммой больше среднего
        for (long sale : sales) {
            if (sale > average) {
                month = month + 1;
            }
        }
        return month;
    }

}
