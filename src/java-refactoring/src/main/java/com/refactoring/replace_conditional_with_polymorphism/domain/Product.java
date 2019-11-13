package com.refactoring.replace_conditional_with_polymorphism.domain;

// TODO: fix this ...
public class Product {

    private final String code;

    public Product(final String code) {
        this.code = code;
    }

    public double disCount() {
        switch (this.code) {
            case "C1":
                return 10d;
            case "C2":
                return 20d;
            case "C3":
                return 30d;
        }
        return 0.0d;
    }
}
