
package com.mycompany.projeto_java;

public class ConsultaVeterinaria extends Servico {

    public ConsultaVeterinaria(double precoBase) {
        super("Consulta Veterinária", precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        return precoBase;
    }
}

