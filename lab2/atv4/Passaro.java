package lab2.atv4;

public class Passaro extends Animal {
    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo.");
    }

    @Override
    public void dormir() {
        System.out.println(getNome() + " está dormindo.");
    }

    @Override
    public void treinar() {
        System.out.println(getNome() + " está treinando.");
    }

    public void voar() {
        System.out.println(getNome() + " pode voar.");
    }
    public void andar(){
        System.out.println(getNome() + " andando.");
    }
}
