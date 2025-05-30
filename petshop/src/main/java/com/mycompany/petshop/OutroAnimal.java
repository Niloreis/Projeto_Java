package com.mycompany.petshop;

import java.util.Objects;

public class OutroAnimal extends Animal {
    private String tipoEspecifico;

    public OutroAnimal(String nome, String tipo, int idade, String dono, String tipoEspecifico) {
        super(nome, tipo, idade, dono);
        this.tipoEspecifico = tipoEspecifico;
    }

    @Override
    public String toString() {
        return super.toString() + " [OutroAnimal, tipo: " + tipoEspecifico + "]";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && o instanceof OutroAnimal &&
               Objects.equals(tipoEspecifico, ((OutroAnimal) o).tipoEspecifico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoEspecifico);
    }
}
