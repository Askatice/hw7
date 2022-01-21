package com.company;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int [] num = {-16, 0, 5, -2, 45, 7, -3, 9, -5, 6, 1, -17, -12, 15, -14};
        double averege = IntStream.of(num).average().getAsDouble();
            System.out.println("Среднее число: " + averege );

    }
}
