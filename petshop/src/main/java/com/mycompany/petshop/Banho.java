package com.mycompany.petshop;

public class Banho extends Servico {

    public Banho(double precoBase) {
        super("Banho", precoBase);
    }

    @Override
    public double calcularPreco(Animal animal) {
        if (animal instanceof Cachorro) {
            String porte = ((Cachorro) animal).getPorte();
            switch (porte.toLowerCase()) {
                case "pequeno": return precoBase;
                case "medio": return precoBase * 1.2;
                case "grande": return precoBase * 1.5;
            }
        }
        return precoBase * 1.1; // para gatos e outros animais
    }
}

