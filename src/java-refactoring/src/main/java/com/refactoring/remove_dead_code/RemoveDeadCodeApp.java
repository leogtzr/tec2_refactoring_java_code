package com.refactoring.remove_dead_code;

public class RemoveDeadCodeApp {

    private static final class SomeClass {
        private SomeClass() {}

        // TODO: fix this code ...
        public static void someCode() {
            // necessary code ...
            // more good code ...
            if (false) {
                // more code ...
                foo();
                // more code ...
            }
            // more good code
            // necessary code ...
        }

        private static void foo() {
            System.out.println(":(");
        }
    }

    public static void main(final String[] args) {

    }
}
