import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};
        System.out.println("Orjinal liste: " + Arrays.toString(list));
        double[] listHarmonik = new double[list.length];

        double sum = 0;

        for (int i = 0; i < list.length; i++) {
            listHarmonik[i] = 1.0 / list[i];
            sum += listHarmonik[i];
        }
        System.out.println("Harmonik liste: " + Arrays.toString(listHarmonik));

        System.out.println("Harmonik ortalama: " + (list.length / sum));


    }
}
