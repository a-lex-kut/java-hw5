package ru.netology.services;

public class WorkLifeBalanceService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int rest = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money = money - expenses;
                money = money / 3;
                rest++;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return rest;
    }
}
