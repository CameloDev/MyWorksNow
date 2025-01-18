package lab2.atv1;
import java.util.HashSet;

public class MySet {
    private HashSet<Integer> set;
    public MySet() {
        set = new HashSet<>();
    }
    public void add(int number) throws Exception {
        if (set.contains(number)) {
            throw new Exception("Este valor já existe");
        }
        if (number < 0) {
            throw new Exception("Valor negativo não permitido");
        }
        if (number > 100000000) {
            throw new Exception("Número muito grande");
        }
        set.add(number);
    }
    public void printSet() {
        System.out.print("Conjunto final: ");
        for (Integer number : set) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public int getSize() {
        return set.size();
    }
}