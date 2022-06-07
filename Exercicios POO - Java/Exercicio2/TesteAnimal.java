package Exercicio2;

public class TesteAnimal {
    public static void main(String[] args) {
        //Animal a = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru canguru = new Canguru();
        Goldfish goldfish = new Goldfish();
        Arara arara = new Arara();
        Tartaruga tartaruga = new Tartaruga();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();

        /*
        m.setCorPelo("Marrom");
        m.setIdade(7);
        m.setPeso(20);
        m.setMembros(4);
        m.imprime();

        r.setIdade(6);
        r.setMembros(4);
        r.setPeso(3);
        r.setCorEscama("verde");

        p.setIdade(2);
        p.setMembros(1);
        p.setCorEscama("Laranja");
        p.setPeso(1);

        a.setIdade(7);
        a.setMembros(2);
        a.setPeso(4);
        a.setCorPena("Azul");
         */

        m.locomover();
        r.locomover();
        p.locomover();
        a.locomover();

        System.out.println("----------------");

        cachorro.locomover();
        canguru.locomover();
        cachorro.emitirSom();
        canguru.emitirSom();
    }
}
