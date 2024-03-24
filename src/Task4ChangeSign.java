public class Task4ChangeSign {
    public static void main(String[] args) {
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        System.out.println("Зміна знаку всіх непарних елементів масиву:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) { // Перевіряємо, чи число непарне
                numbers[i] *= -1; // Змінюємо знак
            }
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
