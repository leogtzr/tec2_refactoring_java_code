package com.refactoring.removing_setter_method;

public class RemoveSetterMethodApp {

    private static final class Person {

        private String name;

        public Person(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        // TODO: fix this ...
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(final String[] args) {

    }
}
