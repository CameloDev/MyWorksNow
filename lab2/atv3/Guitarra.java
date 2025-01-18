package lab2.atv3;

public class Guitarra extends Instrumento {
    @Override
    public void play() {
        System.out.println("soa");
    }

    @Override
    public String toString() {
        return "Guitarra";
    }
}