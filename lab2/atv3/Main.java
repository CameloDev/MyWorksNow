package lab2.atv3;

public class Main {
    public static void main(String[] args) {
        Instrumento guitarra = new Guitarra();
        Instrumento tambor = new Tambor();
        Instrumento trompete = new Trompete();

        Orquestra orquestra = new Orquestra();
        orquestra.add(guitarra);
        orquestra.add(tambor);
        orquestra.add(trompete);

        orquestra.playAll();

        orquestra.play(0);
    }
}
