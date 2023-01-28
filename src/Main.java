public class Main {
    public static void main(String[] args) {
        Task1();
        System.out.println();
        Task2();
        System.out.println();
        Task3();
        System.out.println();
        Task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void Task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void Task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void Task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double sum = 0;
        double sumAvg = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            sum = sum + i;
            sumAvg = sum / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sumAvg + " рублей");
    }

    public static void Task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}