//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100_000);
        }
        return array;
    }

    public static void task1() {
        System.out.println("task 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма завтрат за месяц составила " + sum + " рублей");
        //task 2

        System.out.println("task 2");
        int[] weeklyCost = {1000, 2500, 3300, 2370, 4500};
        int minAmount = weeklyCost[0];
        int maxAmount = weeklyCost[0];
        for (int i = 1; i < weeklyCost.length; i++) {
            if (weeklyCost[i] < minAmount) {
                minAmount = weeklyCost[i];

            }
            if (weeklyCost[i] > maxAmount) {
                maxAmount = weeklyCost[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minAmount + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxAmount + " рублей.");

        //task 3
        System.out.println("task 3");
        int[] monthlyCost = {7800, 5600, 6430, 8300, 4980};
        int sum2 = 0;
        for (int i = 1; i < monthlyCost.length; i++) ;
        int i = 1;
        sum2 += monthlyCost[i];
        sum2 = sum2 / 5;
        System.out.println("Средняя сумма трат за месяц составила " + sum2 + " рублей.");
        //task 4
        System.out.println("task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}



