package Exercicio2;

public class Cachorro extends Mamifero{
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
}
