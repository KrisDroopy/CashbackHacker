package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCashIfAmountLessBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected =100;
        int actual = service.remain(900);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCashIfAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected =0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);

    }
}