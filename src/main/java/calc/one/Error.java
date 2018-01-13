package calc.one;
import java.util.Scanner;

public class Error {
   static Scanner str = new Scanner(System.in);
   public static double doubleNum() {
   double num=0;
   if (str.hasNextDouble()){
      num=str.nextDouble();
      }
   else
   {
      System.out.println("введите только ЧИСЛО (дробное - через запятую)");
      str.next();
      num = doubleNum();
   }
   return num;
   }
   public static char operation() {
      char ch = str.next().charAt(0);
      if ((ch!='+')&&((ch!='-'))&&(ch!='*')&&(ch!='/')) {
      System.out.println("введите + или * или / или -");
      ch=operation();
      }
      return ch;
   }
}

