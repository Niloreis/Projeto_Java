package com.mycompany.petshop;

import java.util.Objects;

public class Gato extends Animal {
    private String corOlhos;

    public Gato(String nome, String raca, int idade, String dono, String corOlhos) {
        super(nome, raca, idade, dono);
        this.corOlhos = corOlhos;
    }

    @Override
    public String toString() {
        return super.toString() + " [Gato, olhos: " + corOlhos + "]";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && o instanceof Gato &&
               Objects.equals(corOlhos, ((Gato) o).corOlhos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), corOlhos);
    }
}

