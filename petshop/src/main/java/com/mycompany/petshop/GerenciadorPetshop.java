package com.mycompany.petshop;

public class GerenciadorPetshop {
    public static void main(String[] args) {
        // Instanciando serviços
        Servico banho = new Banho(50);
        Servico tosa = new Tosa(40);
        Servico consulta = new ConsultaVeterinaria(100);

        // Lista de serviços disponíveis
        System.out.println("=== SERVICOS DISPONIVEIS ===");
        System.out.println(banho);
        System.out.println(tosa);
        System.out.println(consulta);
        System.out.println();

        // Instanciando animais
        Animal dog1 = new Cachorro("Rex", "Labrador", 5, "Joao", "grande");
        Animal dog2 = new Cachorro("Bidu", "Poodle", 4, "Maria", "pequeno");
        Animal cat1 = new Gato("Mimi", "Persa", 3, "Ana", "Verde");
        Animal ave1 = new OutroAnimal("Loro", "Papagaio", 2, "Carlos", "Ave");

        // Lista de animais com serviços aplicados
        System.out.println("=== ANIMAIS E SERVICOS ===");

        exibirServicosAnimal(dog1, banho, tosa, consulta);
        exibirServicosAnimal(dog2, banho, tosa, consulta);
        exibirServicosAnimal(cat1, banho, tosa, consulta);
        exibirServicosAnimal(ave1, banho, tosa, consulta);

        // Comparando dois animais
        System.out.println("\n=== COMPARACAO DE OBJETOS ===");
        Animal outroDog = new Cachorro("Rex", "Labrador", 5, "Joao", "grande");

        System.out.println("dog1.equals(outroDog): " + dog1.equals(outroDog));
        System.out.println("dog1.hashCode() == outroDog.hashCode(): " + (dog1.hashCode() == outroDog.hashCode()));
    }

    // Método auxiliar para exibir serviços aplicados a um animal
    private static void exibirServicosAnimal(Animal animal, Servico... servicos) {
        System.out.println(animal);
        for (Servico s : servicos) {
            double preco = s.calcularPreco(animal);
            System.out.printf("  - %s: R$ %.2f\n", s.nome, preco);
        }
        System.out.println();
    }
}


