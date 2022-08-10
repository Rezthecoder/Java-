public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");

    }
    public void addHealthyAddition1Name(String name, double price){
        this.healthyExtra1Price = price;
        this.healthyExtra1Name = name;
    }
    public void addHealthyAddition2Name(String name, double price){
        this.healthyExtra2Price = price;
        this.healthyExtra2Name = name;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name != null){
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added "+this.healthyExtra1Name+"for an extra"+this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null){
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added "+this.healthyExtra2Name+"for an extra"+this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
