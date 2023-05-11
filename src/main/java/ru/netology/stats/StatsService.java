package ru.netology.stats;
public class StatsService {

    public int getSumSales(int[] arrSales) {
        int sum = 0;
        for (int i : arrSales) {
            sum = sum + i;
        }
        return sum;
    }

    public int getAverageAmountSalesMonth(int[] arrSales) {
        int averageSum = getSumSales(arrSales) / arrSales.length;

        return averageSum;
    }

    public int getMaxSalesMonth(int[] arrSales) {
        int maxSalesMonth = 0;
        for (int i=0; i<arrSales.length; i++) {
            if (arrSales[maxSalesMonth] <= arrSales[i])

        {
                maxSalesMonth = i;
            }
        }
        return maxSalesMonth+1;
    }
    public int getMinSalesMonth(int[] arrSales) {
        int minSalesMonth = 0;
        for (int i=0; i<arrSales.length; i++) {
            if (arrSales[minSalesMonth] >= arrSales[i])

            {
                minSalesMonth = i;
            }
        }
        return minSalesMonth+1;
    }
    public int getCountMonthMaxSales(int[] arrSales) {
        int countMonthmax = 0;
        int average = getAverageAmountSalesMonth(arrSales) ;
        for (int i=0; i<arrSales.length; i++) {
            if (arrSales[i] > average)
            {
                countMonthmax = countMonthmax + 1;
            }
        }
        return countMonthmax;
    }

    public int getCountMonthMinSales(int[] arrSales) {
        int countMonthmin = 0;
        int average = getAverageAmountSalesMonth(arrSales) ;
        for (int i=0; i<arrSales.length; i++) {
            if (arrSales[i] < average)
            {
                countMonthmin = countMonthmin + 1;
            }
        }
        return countMonthmin;
    }
}
