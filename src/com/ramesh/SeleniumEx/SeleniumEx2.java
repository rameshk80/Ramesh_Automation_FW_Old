package com.ramesh.SeleniumEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumEx2 {
    public static void main(String[] args) throws InterruptedException {
        int rows = 170, k = 0;
        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("saran ramesh varun aryan ");
                ++k;
            }

            System.out.println();
        }

    }
}
