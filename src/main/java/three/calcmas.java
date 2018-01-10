package three;

import java.util.Scanner;

public class calcmas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Вам нужно ввести 1 (калькулятор) или 2 (поиск слова в массиве) = ");
        String chislo = in.next();
        if (chislo.equals("1")) {
            System.out.println("Перед вами примитивный калькулятор. После каждого действия не забывайте нажимать кнопку ENTER ");
            System.out.println("введите ПЕРВОЕ число  ");
            double numb1 = in.nextDouble();
            System.out.println("введите ЗНАК операции (+,-,* или /) ");
            String operator = in.next();
            System.out.println("введите ВТОРОЕ число  ");
            double numb2 = in.nextDouble();
            double summa = numb1 + numb2;
            double razn = numb1 - numb2;
            double umn = numb1 * numb2;
            double del = numb1 / numb2;
            if (operator.equals("+")) {
                System.out.printf("СУММА двух чисел =     %.4f \n", summa);
            }
            if (operator.equals("-")) {
                System.out.printf("РАЗНИЦА двух чисел =   %.4f \n", razn);
            }
            if (operator.equals("*")) {
                System.out.printf("УМНОЖЕНИЕ двух чисел = %.4f \n", umn);
            }
            if (operator.equals("/")) {
                System.out.printf("ДЕЛЕНИЕ двух чисел =   %.4f \n", del);
            }
        }
        if (chislo.equals("2")) {
            System.out.print("Введите РАЗМЕР массива (от 1 до бесконечности) = ");
            int razmer = in.nextInt();
            System.out.println("Введите СЛОВА-элементы массива без пробела. Не забывайте нажимать кнопку ENTER ");
            String max = "";
            String[] mas;
            mas = new String [razmer];
            for(int i=0;i < mas.length; i++){
                mas[i] = in.next();
            }
            for(int i=0;i < mas.length; i++){
                //   System.out.print(mas[i]);    если нужен весь массив вдруг
            }
            for (String amas : mas) {
                if (amas.length() > max.length()) {
                    max = amas;
                }
            }
            System.out.printf ("Самое ДЛИННННОЕ слово в массиве = %s\n", max); ///вывожу самое длинное слово (если было по размеру два одинаково длинных слова - вывожу самое первое из них)
        }
    }
}