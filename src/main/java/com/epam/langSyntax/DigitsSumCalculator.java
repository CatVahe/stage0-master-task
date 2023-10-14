package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        sum = number % 10 + number % 100 / 10 +  number % 1000 / 100 + number / 1000;
        System.out.println(sum);
    }

}
