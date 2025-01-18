package lab2.atv4;

public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public abstract void comer();
    public abstract void dormir();
    public abstract void treinar();
}