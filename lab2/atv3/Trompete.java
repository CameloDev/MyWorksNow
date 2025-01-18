package lab2.atv3;

public class Trompete extends Instrumento {
    @Override
    public void play() {
        System.out.println("apita");
    }

    @Override
    public String toString() {
        return "Trompete";
    }
}