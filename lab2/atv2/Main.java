package lab2.atv2;

public class Main {
    public static void main(String[] args) {
        int[] intArr = {2, 1, 6, 8, 3};
        Arranjo arranjoInt = new ArranjoInt(intArr);
        arranjoInt.sort();
        arranjoInt.print();

        float[] floatArr = {0.2f, 0.5f, 1.2f, 2.5f};
        Arranjo arranjoFloat = new ArranjoFloat(floatArr);
        arranjoFloat.sort();
        arranjoFloat.print();

        char[] charArr = {'n', 'v', 'd', 'a'};
        Arranjo arranjoChar = new ArranjoChar(charArr);
        arranjoChar.sort();
        arranjoChar.print();
    }
}