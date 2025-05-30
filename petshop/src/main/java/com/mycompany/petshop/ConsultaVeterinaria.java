    package com.mycompany.petshop;

public class ConsultaVeterinaria extends Servico {

    public ConsultaVeterinaria(double precoBase) {
        super("Consulta Veterinária", precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        return precoBase + (animal.idade > 10 ? 30 : 0);
    }
}

