package com.leena.OCP.designPatterns2.builderPattern;
import com.leena.OCP.designPatterns2.immutableObjects.AnimalImmutable;

import java.util.*;

public class AnimalBuilder {

    private String species;
    private int age;
    private List<String> favoriteFoods;

    public AnimalBuilder setAge(int age) {

        this.age = age;
        return this;
    }


    public AnimalBuilder setSpecies(String species) {

        this.species = species;
        return this;
    }

    public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {

        this.favoriteFoods = favoriteFoods;
        return this;
    }

    public AnimalImmutable build() {

        return new AnimalImmutable(species, age, favoriteFoods);
    }

    public static void main(String[] args) {

        AnimalBuilder duckBuilder = new AnimalBuilder();
        duckBuilder
                .setAge(4)
                .setFavoriteFoods(Arrays.asList("meat","more meat")).setSpecies("duck");

        AnimalImmutable duck = duckBuilder.build();

        AnimalImmutable flamingo = new AnimalBuilder().setFavoriteFoods(Arrays.asList("algea","insects"))
                .setSpecies("flamingo").build();

    }
}
