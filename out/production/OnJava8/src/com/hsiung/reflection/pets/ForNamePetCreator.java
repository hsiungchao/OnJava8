// reflection/pets/ForNamePetCreator.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package com.hsiung.reflection.pets;

import java.util.*;

public class ForNamePetCreator extends Creator {
    private static final List<Class<? extends Pet>> types = new ArrayList<>();
    // Types you want randomly created:
    private static final String[] typeNames = {
            "com.hsiung.reflection.pets.Mutt",
            "com.hsiung.reflection.pets.Pug",
            "com.hsiung.reflection.pets.EgyptianMau",
            "com.hsiung.reflection.pets.Manx",
            "com.hsiung.reflection.pets.Cymric",
            "com.hsiung.reflection.pets.Rat",
            "com.hsiung.reflection.pets.Mouse",
            "com.hsiung.reflection.pets.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add((Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
