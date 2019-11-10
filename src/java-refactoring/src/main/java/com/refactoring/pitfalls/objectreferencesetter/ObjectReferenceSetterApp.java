package com.refactoring.pitfalls.objectreferencesetter;

import java.util.Arrays;

public class ObjectReferenceSetterApp {

    private static final class SomeClass {

        private int[] scores;

        // TODO: Fix this ...
        public int[] getScores() {
            return this.scores;
        }

        // TODO: fix this ...
        public void setScores(final int[] scores) {
            this.scores = scores;
        }

        @Override
        public String toString() {
            return "SomeClass{" +
                    "scores=" + Arrays.toString(scores) +
                    '}';
        }
    }

    public static void main(final String[] args) {
        final int[] scores = {1, 2, 3, 4, 5};
        final SomeClass someClass = new SomeClass();
        someClass.setScores(scores);

        System.out.println(someClass.toString());

        scores[0] = 7384;
        someClass.setScores(scores);

        System.out.println(someClass.toString());

        // scores variable can now vary without affecting scores inner property.
        scores[2] = 234;

        System.out.println(someClass.toString());

        someClass.getScores()[1] = -6723;

        System.out.println(someClass.toString());


    }
}
