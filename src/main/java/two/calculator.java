package two;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Перед вами примитивный калькулятор. После каждого действия не забывайте нажимать кнопку ENTER ");
        System.out.printf("               введите ПЕРВОЕ число ");
        double numb1 = in.nextDouble();
        System.out.printf("введите ЗНАК операции (+,-,* или /) ");
        String operator = in.next();
        System.out.printf("               введите ВТОРОЕ число ");
        double numb2 = in.nextDouble();
        double summa = numb1 + numb2;
        double razn = numb1 - numb2;
        double umn = numb1 * numb2;
        double del = numb1 / numb2;
        if (operator.equals("+")) {
            System.out.printf("сумма двух чисел =                  %.4f \n", summa);
        }
        if (operator.equals("-")) {
            System.out.printf("разница двух чисел =                %.4f \n", razn);
        }
        if (operator.equals("*")) {
            System.out.printf("умножение двух чисел =              %.4f \n", umn);
        }
        if (operator.equals("/")) {
            System.out.printf("деление двух чисел =                %.4f \n", del);
        }
    }
}