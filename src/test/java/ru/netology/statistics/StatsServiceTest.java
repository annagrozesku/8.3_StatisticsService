package ru.netology.statistics;
import org.junit.jupiter.api.Test;
import ru.netology.statistics.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void findMax() {
        StatsService service = new StatsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxOtherArr() {
        StatsService service = new StatsService();

        long[] incomesInBillions = {12, 5, 14, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 14;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}