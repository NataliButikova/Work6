package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    public void shouldFindAmount() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 180;
        long actualAmount = service.sumSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldAverageAmount() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        long actualAverage = service.getAverageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.getMaxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMinMonth() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.getMinSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindAverageMinMonth() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinAverage = 5;
        int actualMinAverage = service.getMinAverage(sales);

        Assertions.assertEquals(expectedMinAverage, actualMinAverage);
    }

    @Test
    public void shouldFindAverageMaxMonth() {
        StatisticsService service = new StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxAverage = 7;
        int actualMaxAverage = service.getMaxAverage(sales);

        Assertions.assertEquals(expectedMaxAverage, actualMaxAverage);
    }
}