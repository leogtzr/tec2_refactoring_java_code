package com.refactoring.change_function_declaration;

public class ChangeFunctionDeclarationApp {

    private static final class CircleUtils {
        private CircleUtils() {}
        // TODO: what'a a good function name?
        public static double circum(final double radius) {
            return 2.0 * Math.PI * radius;
        }
    }

    public static void main(final String[] args) {

    }
}
