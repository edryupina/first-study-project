import box.cracker;
import box.present;
import box.sweet;

public class baze {
    public static void main(String[] args) {
        sweet sweet1 = new sweet("Kitcat", "9.99", "250","1");
        sweet sweet2 = new sweet("Nuts", "5.99", "450","2");
        cracker cracker3 = new cracker("fish", "1.99", "999", "cool");
        present[] abox ={sweet1, sweet2, cracker3};
        for (present somePresent : abox) {
            System.out.println(somePresent.toString());
        }

    }
}
