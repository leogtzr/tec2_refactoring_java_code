package com.refactoring.remove_middle_man;

public class RemoveMiddleManApp {

    private static final class Manager {
    }

    private static final class Department {
        private Manager manager;
    }

    private static final class Person {
        private Department department;

        public Manager manager() {
            return this.department.manager;
        }
    }

    public static void main(final String[] args) {
        final Person person = new Person();
        // final Manager manager = person.manager();
        final Manager manager1 = person.department.manager;
    }
}
