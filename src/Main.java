//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int a = 1;
    int b = 1;
    int c = 2;
    int d = 1;

    int sum1 = a + b;
    int sum2 = c + d;

    System.out.println("Перше порівняння: " + (sum1 > sum2));

    sum1 += 1;

    sum2 -= 2;

    System.out.println("Друге порівняння: " + (sum1 > sum2));

        boolean isSumEven = (sum1 % 2 == 0) || (sum2 % 2 == 0);
        System.out.println("Чи є хоча б одна сума кратною 2: " + isSumEven);
    }
    }
