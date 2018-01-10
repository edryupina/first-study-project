package four.two.box;
public class cracker extends present {
    private String salinity;
    public cracker(String name, Double price, Double weight, String salinity) {
        super(name, price, weight);
        this.salinity = salinity;
    }
    public String getSalinity() {
        return salinity;
    }
    public void setSalinity(String salinity) {
        this.salinity=salinity;
    }
    public String toString() {
        return "cracker = [" + super.toString() + ", salinity = " + salinity + "]";
    }
}

