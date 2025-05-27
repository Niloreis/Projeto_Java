
package com.mycompany.projeto_java;

public class Banho extends Servico {

    public Banho(double precoBase) {
        super("Banho", precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            if (cachorro.getPorte().equalsIgnoreCase("Grande")) {
                return precoBase + 20.0;
            } else if (cachorro.getPorte().equalsIgnoreCase("Médio")) {
                return precoBase + 10.0;
            } else {
                return precoBase + 5.0;
            }
        }
        return precoBase; // Para outros animais
    }
}

