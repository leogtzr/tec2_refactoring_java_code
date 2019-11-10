package com.refactoring.rename_variable;

public class RenameVariableApp {

    private static void foo() {
        final double radius = 0.3;
        // TODO: fix this ...
        final double ca = 2.0 * Math.PI * radius;

        final double height = 1.2;
        final double width = 1.3;
        // TODO; fix this ... 
        final double a = height * width;
    }

    public static void main(final String[] args) {

    }
}
