package com.refactoring.reference_to_a_value;

public class ReferenceToAValueApp {

    private static final class Product {
        // ...
        private Money price;

        public void applyDiscount(final double arg) {
            // TODO: fix this code ...
            this.price.amount -= arg;
        }

//        public void applyDiscount(final double arg) {
//            this.price = new Money(this.price.amount - arg, new Concurrency());
//        }

    }

    private static final class Money {
        // ...
        private double amount;
        public Money(final double amount, final Concurrency concurrency) {
            this.amount = amount;
        }
    }

    private static final class Concurrency {

    }

    public static void main(final String[] args) {

    }
}
