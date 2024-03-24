public class Task2IterateArray {
    public static void main(String[] args) {
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        System.out.println("Перебір масиву за допомогою циклу while:");
        int index = 0;
        while (index < numbers.length) {
            System.out.print(numbers[index] + " ");
            index++;
        }
        System.out.println();

        System.out.println("Перебір масиву за допомогою циклу for:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Числа з непарним індексом, використовуючи цикл while:");
        index = 1; // Починаємо з непарного індексу (1)
        while (index < numbers.length) {
            System.out.print(numbers[index] + " ");
            index += 2; // Збільшуємо індекс на 2, щоб отримати наступний непарний індекс
        }
        System.out.println();

        System.out.println("Числа з парним індексом, використовуючи цикл for:");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Масив в зворотньому порядку:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
