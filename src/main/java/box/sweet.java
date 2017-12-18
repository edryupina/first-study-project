package box;
public class sweet extends present {
    private String sweetness;
    public sweet(String name, Double price, Double weight, String sweetness) {
        super(name, price, weight);
        this.sweetness = sweetness;
    }
    public String getSweetness() {
        return sweetness;
    }
    public void setSweetness(String sweetness) {
        this.sweetness=sweetness;
    }
    public String toString() {
        return "sweet = [" + super.toString() + ", sweetness = " + sweetness + "]";
    }
}

