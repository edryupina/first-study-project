package calc.two;

public class Vvod {
   public static void main(String args[]){
      System.out.println("введите ПЕРВОЕ число");
      double numb1 = calc.two.Error.doubleNum();
      System.out.println("введите ЗНАК операции");
      char znak = calc.two.Error.operation();
      System.out.println("введите ВТОРОЕ число");
      double numb2 = calc.two.Error.doubleNum();
      System.out.println("получилось ИТОГО");
      calc.two.Class calc;
      switch (znak){
         case '+': calc = new Sum();
         System.out.printf ("%.4f", calc.getResult(numb1,numb2));
         break;
         case '*': calc = new Umn();
         System.out.printf ("%.4f", calc.getResult(numb1,numb2));
         break;
         case '-': calc = new Razn();
         System.out.printf ("%.4f", calc.getResult(numb1,numb2));
         break;
         case '/': calc = new Del();
         System.out.printf ("%.4f", calc.getResult(numb1,numb2));
         break;
      }
   }
}

