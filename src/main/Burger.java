
public class Burger {

    private String Name;
    private String Meat;
    private double Price;
    private String BreadType;

    public Burger(String Name, String Meat, double Price, String BreadType) {
        this.Name = Name;
        this.Meat = Meat;
        this.BreadType = BreadType;
        this.Price = Price;
    }
    public String getName() {
        return Name;
    }
    public double getPrice() {
        return Price;
    }
    public String toString() {
        return "Burger: " + Name + " Price: " + Price + " Meat: " + Meat + " Bread: " + BreadType;
    }

}