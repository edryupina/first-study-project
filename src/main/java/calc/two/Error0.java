package calc.two;
import java.util.Scanner;

public class Error0 {
   static Scanner nul = new Scanner(System.in);
   public static char operation() {
      char ch = nul.next().charAt(0);
      if (ch == "0") {
         System.out.println("на ноль делить нельзя");
         ch=operation();
      }
      }
   }
}

