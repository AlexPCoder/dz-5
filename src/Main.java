//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int sum1 = a + b;

        int sum2 = c + d;

        System.out.println("First comparison:" + (sum1 > sum2));

        sum1 +=1;

        sum2 -=2;

        System.out.println("Second comparison:" + (sum1 > sum2));

        boolean isEven = (sum1 % 2 == 0) || (sum2 % 2 == 0);
        System.out.println("At least one sum is even:" + (isEven));
        }
    }
