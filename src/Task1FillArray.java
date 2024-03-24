import java.util.Arrays;

public class Task1FillArray {
    public static void main(String[] args) {
        int[] evenNumbers = new int[50];
        int[] oddNumbers = new int[50];

        for (int i = 0; i < 50; i++) {
            evenNumbers[i] = 2 * i; // Заповнення парними числами
            oddNumbers[i] = 2 * i + 1; // Заповнення непарними числами
        }

        System.out.println("Масив парних чисел: " + Arrays.toString(evenNumbers));
        System.out.println("Масив непарних чисел: " + Arrays.toString(oddNumbers));
    }
}
