package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

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
    void FindMax() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;

        StatsService service = new StatsService();

        long actual = service.findMax(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void Findmin() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;

        StatsService service = new StatsService();

        long actual = service.findMin(purchases);
        assertEquals(expected, actual);
    }
}
