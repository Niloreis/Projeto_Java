package com.mycompany.projeto_java;

public class Tosa extends Servico {

    public Tosa(double precoBase) {
        super("Tosa", precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            if (cachorro.racaTipo.equalsIgnoreCase("Poodle")) {
                return precoBase + 15.0;
            }
        }
        return precoBase;
    }
}
