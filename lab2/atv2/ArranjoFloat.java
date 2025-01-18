package lab2.atv2;
import java.util.Arrays;

public class ArranjoFloat extends Arranjo {
    private float[] arr;

    public ArranjoFloat(float[] arr) {
        this.arr = arr;
    }
    @Override
    public void sort() {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            float temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
    @Override
    public void print() {
        System.out.println(Arrays.toString(arr));
    }
}