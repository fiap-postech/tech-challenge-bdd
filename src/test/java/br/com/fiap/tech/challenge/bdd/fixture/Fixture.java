package br.com.fiap.tech.challenge.bdd.fixture;

import org.instancio.Instancio;
import org.instancio.Model;

public abstract class Fixture {

    private Fixture(){}

    public static <T> T create(Model<T> model) {
        return Instancio.of(model).create();
    }

}
