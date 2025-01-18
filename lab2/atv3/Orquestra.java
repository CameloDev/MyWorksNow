package lab2.atv3;

import java.util.ArrayList;
import java.util.List;

public class Orquestra {
    private List<Instrumento> instrumentos;
    public Orquestra() {
        this.instrumentos = new ArrayList<>();
    }
    public void add(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }
    public void play(int index) {
        if (index >= 0 && index < instrumentos.size()) {
            System.out.print(instrumentos.get(index).toString() + ": ");
            instrumentos.get(index).play();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Tocar todos os instrumentos em sequência
    public void playAll() {
        System.out.println("Orquestra:");
        for (Instrumento instrumento : instrumentos) {
            instrumento.play();
        }
    }
}