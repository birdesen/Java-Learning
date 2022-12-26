import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu: ");
        int length = input.nextInt();
        System.out.println("Dizinin elemanlarını giriniz: ");
        int[] list = new int[length];
        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". elemanı:  ");
            int item = input.nextInt();
            list[i] = item;
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
