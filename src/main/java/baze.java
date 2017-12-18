import box.cracker;
import box.present;
import box.sweet;

public class baze {
    public static void main(String[] args) {
        sweet sweet1 = new sweet("Kitcat",  9.99,399.0,  "1");
        sweet sweet2 = new sweet("Nuts", 5.55, 450.0, "2");
        cracker cracker3 = new cracker("Fish", 1.99,999.0, "cool");
        present[] abox = {sweet1, sweet2, cracker3};
       for (present somePresent : abox) {
          System.out.println(somePresent.toString());
        }
        System.out.println("----------------");
        double price=(double) 0;
        double weight=(double) 0;
        for (present x: abox) {
            System.out.println(x.getName() + "  " + x.getWeight() + "   " + x.getPrice() );
            weight = weight + x.getWeight();
            price = price + x.getPrice();
        }
      //  System.out.print("----------------\nВес  : " + weight + "\nЦена :         " + price);
        System.out.println("----------------");
        System.out.print ("Вес :   " + weight +"\n");
        System.out.printf ("Цена:          %.2f \n", price);
    }
}
