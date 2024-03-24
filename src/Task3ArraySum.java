public class Task3ArraySum {
    public static void main(String[] args) {
        double[] array = {10.5, 20.3, 7.5, 8.1, 12.6};
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        System.out.println("Сума елементів масиву: " + sum);
    }
}
