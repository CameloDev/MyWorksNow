package lab2.atv4;

public class Main {
    public static void main(String[] args) {
        Mamifero gato = new Mamifero("Gato");
        Passaro pato = new Passaro("Pato");
        Reptil lagarto = new Reptil("Lagarto");
        Passaro falcao = new Passaro("Falcão");
        Passaro morcego = new Passaro("Morcego");

        Jogador jogador = new Jogador("Victor");

        jogador.adquirirMascote(gato);
        jogador.adquirirMascote(pato);

        gato.andar();
        pato.andar();
        pato.voar();
        lagarto.nadar();
        jogador.listarAnimais();
    }
}