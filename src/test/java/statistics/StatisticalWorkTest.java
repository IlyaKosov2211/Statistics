package statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticalWorkTest {

    @Test
    void shouldAmountCalculateService() {
        StatisticalWork service = new StatisticalWork();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateService(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatisticalWork service = new StatisticalWork();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverage(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxMonth() {
        StatisticalWork service = new StatisticalWork();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMaxMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinMonth() {
        StatisticalWork service = new StatisticalWork();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldPurchasesBelowTheAverage() {
        StatisticalWork service = new StatisticalWork();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findPurchasesBelowTheAverage(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldPurchasesAboveTheAverage() {
        StatisticalWork service = new StatisticalWork();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findPurchasesAboveTheAverage(purchases);

        assertEquals(expected, actual);
    }
}