package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FuturePrediction {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");

    }
}
