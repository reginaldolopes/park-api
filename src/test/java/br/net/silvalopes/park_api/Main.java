package br.net.silvalopes.park_api;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate nascimento = LocalDate.of(1975, 9, 20);
        int idade = Period.between(nascimento, LocalDate.now()).getYears();
        int idade2 = (int) ChronoUnit.YEARS.between(nascimento, LocalDate.now());
        System.out.println(idade);
        System.out.println(idade2);

    }
}
