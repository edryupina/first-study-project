package four.two.box;
public abstract class present {
    private String name;
    private Double price;
    private Double weight;
    public present(String name, Double price, Double weight) {
        this.name=name;
        this.price=price;
        this.weight=weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price=price;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight=weight;
    }
    public String toString() {
        return "name = " + name + ", price = " + price + ", weight = " + weight;
    }
}
