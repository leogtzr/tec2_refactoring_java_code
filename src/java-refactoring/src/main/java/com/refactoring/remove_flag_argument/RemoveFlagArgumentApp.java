package com.refactoring.remove_flag_argument;

public class RemoveFlagArgumentApp {

    private static final class Event {

        private Event() {}

        public static void bookConcert(final Customer customer, final boolean isPremium) {
            if (isPremium) {
                // book premium customer
            } else {
                // book regular customer ...
            }
        }

        // TODO: fix the previous code.

    }

    private static final class Customer {
        // some properties here ...
    }

    public static void main(final String[] args) {

    }
}
