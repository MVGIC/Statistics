package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverageSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum / 12;
    }

    public long findMaxMonth(long[] purchases) {
        int maxIndex = 0;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[maxIndex] <= purchases[i])
                maxIndex = i;
        }
        return maxIndex + 1;
    }


    public long findMinMonth(long[] purchases) {
        int minIndex = 0;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[minIndex] > purchases[i])
                minIndex = i;
        }
        return minIndex + 1;
    }

    public long findBelowAverage(long[] purchases) {
        int amountBelow = 0;
        for (long currentMax : purchases) {
            if (currentMax < 15) {
                amountBelow++;
            }
        }
        return amountBelow;
    }

    public long findAboveAverage(long[] purchases) {
        int amountAbove = 0;
        for (long currentMax : purchases) {
            if (currentMax > 15) {
                amountAbove++;
            }
        }
        return amountAbove;
    }

}