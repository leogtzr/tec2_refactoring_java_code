package com.refactoring.decompose_conditional;

public class DecomposeConditionalApp {

    private static final class Person {
        private String name;
        private int age;

        private void print() {
            // TODO: fix this ...
            if (this.age > 70) {
                //
            } else {
                //
            }
        }

        private boolean isOld() {
            return this.age > 70;
        }
    }

    public static void main(final String[] args) {

    }
}
