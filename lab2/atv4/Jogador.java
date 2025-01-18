package lab2.atv4;
import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Animal> animaisDeEstimacao;

    public Jogador(String nome) {
        this.nome = nome;
        this.animaisDeEstimacao = new ArrayList<>();
    }

    public void adquirirMascote(Animal animal) {
        animaisDeEstimacao.add(animal);
        System.out.println("Jogador adquiriu o mascote: " + animal.getNome());
    }

    public void listarAnimais() {
        System.out.println("O jogador tem os seguintes animais:");
        for (Animal animal : animaisDeEstimacao) {
            System.out.println("- " + animal.getNome());
        }
    }
}