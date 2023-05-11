package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class StatsServiceTest {

    int[] arrSales = {7, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();

        System.out.println("Сумма всех продаж " + service.getSumSales(arrSales));

    }

    @Test
    public void shouldFindAveradgeAmountSale() {
        StatsService service = new StatsService();

        System.out.println("Средняя сумма продаж в месяц " + service.getAverageAmountSalesMonth(arrSales));

    }

    @Test
    public void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        System.out.println("Номер месяца, в котором был пик продаж " + service.getMaxSalesMonth(arrSales));

    }

    @Test
    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        System.out.println("Номер месяца, в котором был минимум продаж " + service.getMinSalesMonth(arrSales));

    }

    @Test
    public void shouldFindCountMonthMinSales() {
        StatsService service = new StatsService();

        System.out.println("Количество месяцев, в которых продажи были ниже среднего " + service.getCountMonthMinSales(arrSales));

    }

    @Test
    public void shouldFindCountMonthMaxSales() {
        StatsService service = new StatsService();

        System.out.println("количество месяцев, в которых продажи были выше среднего " + service.getCountMonthMaxSales(arrSales));

    }

}
