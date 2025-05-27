
package com.mycompany.projeto_java;

public class Teste_GerenciadorPetshop {
    
    public static void main(String[] args) {
        // Criação de instâncias de animais
        Animal cachorro = new Cachorro("Rex", "Labrador", 5, "João", "Grande");
        Animal gato = new Gato("Mimi", "Siamês", 3, "Maria", "Azul");
        Animal outroAnimal = new OutroAnimal("Pássaro", "Canário", 2, "Carlos", "Passeriforme");

        // Criação de serviços
        Servico banho = new Banho(30.0);
        Servico tosa = new Tosa(40.0);
        Servico consulta = new ConsultaVeterinaria(50.0);

        // Exibindo serviços e preços
        System.out.println("Preço do banho para cachorro: " + banho.calcularPreco(cachorro));
        System.out.println("Preço da tosa para cachorro: " + tosa.calcularPreco(cachorro));
        System.out.println("Preço da consulta para gato: " + consulta.calcularPreco(gato));

        // Comparação de objetos com equals() e hashCode()
        Cachorro cachorroComparado = new Cachorro("Rex", "Labrador", 5, "João", "Grande");
        boolean saoIguais = cachorro.equals(cachorroComparado);
        System.out.println("\nCachorros iguais? " + saoIguais);

        if (saoIguais) {
            System.out.println("\n=== Dados dos Animais ===");
            System.out.println("Cachorro: " + cachorro);
            System.out.println("Gato: " + gato);
            System.out.println("Outro Animal: " + outroAnimal);
        }

    }
}
