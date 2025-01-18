package lab2.atv2;
import java.util.Arrays;

public class ArranjoInt extends Arranjo {
    private int[] arr;

    public ArranjoInt(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void sort() {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(arr));
    }
}