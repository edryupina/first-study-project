package calc.two;

public class Vvod {
   public static void main(String args[]) {
      try {
         System.out.println("введите ПЕРВОЕ число");
         double numb1 = Error.doubleNum();
         System.out.println("введите ЗНАК операции");
         char znak = Error.operation();
         System.out.println("введите ВТОРОЕ число");
         double numb2 = Error.doubleNum();
         System.out.println("получилось ИТОГО");
         Class calc = null;
         switch (znak) {
            case '+':
               calc = new Sum();
               break;
            case '*':
               calc = new Umn();
               break;
            case '-':
               calc = new Razn();
               break;
            case '/':
               calc = new Del();
               break;
         }
         System.out.printf("%.4f", calc.getResult(numb1, numb2));
         System.out.println();
      } catch (myExeption e) {
         System.out.println("Ошибка деления на ноль! Результат: " + e.getResult());
         e.printStackTrace();
      }
   }
}

