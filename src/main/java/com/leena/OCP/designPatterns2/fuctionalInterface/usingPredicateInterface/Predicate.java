package com.leena.OCP.designPatterns2.fuctionalInterface.usingPredicateInterface;

import com.leena.OCP.designPatterns2.fuctionalInterface.withLambdas.Animal;

public interface Predicate<T> {

    public boolean test(Animal a);
}
