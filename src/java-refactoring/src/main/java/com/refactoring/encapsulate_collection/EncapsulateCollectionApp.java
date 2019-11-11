package com.refactoring.encapsulate_collection;

import java.util.ArrayList;
import java.util.List;

public class EncapsulateCollectionApp {

    private static final class Student {
        private List<String> courses = new ArrayList<>();

        // TODO: fix this ...
        public List<String> getCourses() {
            return this.courses;
        }
    }

    public static void main(final String[] args) {

    }
}
