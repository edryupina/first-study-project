package calc.two;

public class Del extends Class {
   double getResult(double numb1, double numb2) throws myExeption {
      if (numb2!=0) return numb1/numb2;
      else {
         throw new myExeption(0);
      }
   }
}
