

        import java.util.Map;
        import java.util.Scanner;

public class Order {
    Map<Burger, AddExtras> menu;
    private Burger burger;
    private Double BurgerPrice;
    private AddExtras BurgerExtra;

    public Order(Map<Burger, AddExtras> Menu) {
        this.menu = Menu;
    }
    public void BurgerChoice(){
        while(true){
            System.out.println("Choose burger: ");
            Scanner reader = new Scanner(System.in);
            String SelectedBurger = reader.nextLine();
            for (Map.Entry<Burger, AddExtras> entry : menu.entrySet()) {
                if(entry.getKey().getName().matches(SelectedBurger)){
                    this.burger = entry.getKey();
                    this.BurgerPrice = entry.getKey().getPrice();
                    this.BurgerExtra = entry.getValue();
                }
            }
            if(this.burger != null && this.BurgerExtra != null) {
                break;
            } else {
                System.out.println("Please change your configuration");
            }
        }
    }
    public void AdditionChoice(){
        if(BurgerExtra.Extras(this.BurgerExtra.extra1))
        {
            this.BurgerPrice = this.BurgerPrice + this.BurgerExtra.extra1.getPrice();
        };
        if(BurgerExtra.Extras(this.BurgerExtra.extra2)){
            this.BurgerPrice = this.BurgerPrice + this.BurgerExtra.extra2.getPrice();
        }
        if(BurgerExtra.Extras(BurgerExtra.extra3)){
            this.BurgerPrice = this.BurgerPrice + this.BurgerExtra.extra3.getPrice();
        }
        if(BurgerExtra.Extras(BurgerExtra.extra4)){
            this.BurgerPrice = this.BurgerPrice + this.BurgerExtra.extra4.getPrice();
        }
    }
    public void finalPrice(){
        this.BurgerPrice = Math.round(this.BurgerPrice * 8) / 8.00;
        System.out.println("Total: " + this.BurgerPrice + "€");
    }

}