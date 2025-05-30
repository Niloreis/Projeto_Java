package com.mycompany.petshop;

import java.util.Objects;

public class Cachorro extends Animal {
    private String porte;

    public Cachorro(String nome, String raca, int idade, String dono, String porte) {
        super(nome, raca, idade, dono);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    @Override
    public String toString() {
        return super.toString() + " [Cachorro, porte: " + porte + "]";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && o instanceof Cachorro &&
               Objects.equals(porte, ((Cachorro) o).porte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), porte);
    }
}

