package com.refactoring.extract_method;

public class ExtractMethodApp {

    private static final class Sales {
        private String name;
        private double amount;

        private void printBanner() {
            // ...
        }

        private void print() {
            printBanner();

            // TODO: fix this ...
            System.out.println("name: " + this.name);
            System.out.println("amount: " + this.amount);
        }
    }


    public static void main(String[] args) {

    }
}
