package ru.netology.stats;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    @Test
    void CalculateSum() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        StatsService service = new StatsService();

        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void CalculateAverageSum() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        StatsService service = new StatsService();

        long actual = service.calculateAverageSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void FindMaxMonth() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        StatsService service = new StatsService();

        long actual = service.findMaxMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void FindMinMonth() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        StatsService service = new StatsService();

        long actual = service.findMinMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void FindBelowAverage() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        StatsService service = new StatsService();

        long actual = service.findBelowAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void FindAboveAverage() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        StatsService service = new StatsService();

        long actual = service.findAboveAverage(purchases);
        assertEquals(expected, actual);
    }
}
