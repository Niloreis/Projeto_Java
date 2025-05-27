package com.mycompany.projeto_java;

import java.util.Objects;

public class OutroAnimal extends Animal {
    private String tipoEspecifico;

    public OutroAnimal(String nome, String racaTipo, int idade, String proprietario, String tipoEspecifico) {
        super(nome, racaTipo, idade, proprietario);
        this.tipoEspecifico = tipoEspecifico;
    }

    @Override
    public String toString() {
        return "OutroAnimal [Nome=" + nome + ", Raça=" + racaTipo + ", Idade=" + idade + ", Proprietário=" + proprietario + 
                ", Tipo Específico=" + tipoEspecifico + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        OutroAnimal outroAnimal = (OutroAnimal) o;
        return Objects.equals(tipoEspecifico, outroAnimal.tipoEspecifico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoEspecifico);
    }
}
