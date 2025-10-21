package org.example.stats.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class statsServiceTests {

    @Test
    public void monthWithMinSales() {
        statsService service = new statsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void monthWithMaxSales() {
        statsService service = new statsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void sumSales() {
        statsService service = new statsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void averageSales() {
        statsService service = new statsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.avgSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void monthsWithBelowAverageSales() {
        statsService service = new statsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countOfMonthsWithMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void monthWithAboveAverageSales() {
        statsService service = new statsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countOfMonthWithMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}