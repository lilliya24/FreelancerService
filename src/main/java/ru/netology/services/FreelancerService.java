package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // количество денег на счету
        int counter = 0; // счётчик месяцев отдыха
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                // отдыхает
                money -= expenses;
                money /= 3;
                counter += 1;
            } else {
                //работает
                money += income;
                money -= expenses;
            }
        }
        return counter;
    }
}
