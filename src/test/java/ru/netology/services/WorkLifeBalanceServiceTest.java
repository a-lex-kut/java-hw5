package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkLifeBalanceServiceTest {
    @Test
    public void threeMonthRest() {
        WorkLifeBalanceService service = new WorkLifeBalanceService();
        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void twoMonthRest() {
        WorkLifeBalanceService service = new WorkLifeBalanceService();
        int actual = service.calculate(100000, 60000, 150000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}