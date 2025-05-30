package com.mycompany.petshop;

public class Tosa extends Servico {

    public Tosa(double precoBase) {
        super("Tosa", precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        if (animal instanceof Cachorro && animal.racaTipo.equalsIgnoreCase("poodle")) {
            return precoBase * 1.3;
        }
        return precoBase;
    }
}

