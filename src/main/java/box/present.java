package box;
public abstract class present {
    private String name;
    private String price;
    private String weight;
    public present(String name, String price, String weight) {
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
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price=price;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight=weight;
    }
    public String toString() {
        return "name = " + name + ", price = " + price + ", weight = " + weight;
    }
}
