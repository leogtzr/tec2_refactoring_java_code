package com.refactoring.consolidate_conditional_expression;

public class ConsolidateConditionalExpressionApp {

    private static final class Employee {
        private int seniority;
        private int monthsDisabled;
        private boolean isPartTime;

        // TODO: Fix this ...
        private static void doSomethingWith(final Employee anEmployee) {
            if (anEmployee.seniority < 2) return;
            if (anEmployee.monthsDisabled > 12) return;
            if (anEmployee.isPartTime) return;

            // more code ...
        }

    }

    public static void main(final String[] args) {

    }
}
