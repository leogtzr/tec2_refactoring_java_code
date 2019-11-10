package com.refactoring.combine_related_functions_into_class;

public class CombineRelatedFunctionsIntoClassApp {

    private static final class Window {  }

    private static final class SomeClass {

        // TODO; fix this ...
        private static void resize(final Window window, final int x, final int y) {
            // ...
        }

        private static void maximize(final Window window) {

        }

        private static void destroy(final Window window) {

        }
    }

    public static void main(final String[] args) {

    }
}
