
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
    System.out.println("\n===============================");
    System.out.println("       DADOS DOS ANIMAIS       ");
    System.out.println("===============================\n");

    System.out.println(">>> Cachorro");
    System.out.println("Nome: " + cachorro.getNome());
    System.out.println("Raça: " + cachorro.getRaca());
    System.out.println("Idade: " + cachorro.getIdade() + " anos");
    System.out.println("Dono: " + cachorro.getNomeDono());
    System.out.println("Porte: " + ((Cachorro) cachorro).getPorte());

    System.out.println("\n>>> Gato");
    System.out.println("Nome: " + gato.getNome());
    System.out.println("Raça: " + gato.getRaca());
    System.out.println("Idade: " + gato.getIdade() + " anos");
    System.out.println("Dono: " + gato.getNomeDono());
    System.out.println("Cor dos Olhos: " + ((Gato) gato).getCorOlhos());

    System.out.println("\n>>> Outro Animal");
    System.out.println("Nome: " + outroAnimal.getNome());
    System.out.println("Raça: " + outroAnimal.getRaca());
    System.out.println("Idade: " + outroAnimal.getIdade() + " anos");
    System.out.println("Dono: " + outroAnimal.getNomeDono());
    System.out.println("Tipo: " + ((OutroAnimal) outroAnimal).getTipo());
    
    System.out.println("\n===============================\n");
}

    }
}
