package com.company;

public class AbstractCow {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        public String getName() {
            return "Я - Буренка";
        }
    }
}
