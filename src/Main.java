import Wall.Wall;

public class Main {
    public static void main(String[] args) {
Hamburger hamburger = new Hamburger("Basic", "Beef", 3.56, "White");
        System.out.println("Price is "+hamburger.itemizeHamburger());
hamburger.addAddition1Name("Tomato", 0.27);
hamburger.addAddition2Name("Lettuce", 0.75);
hamburger.addAddition3Name("Cheese", 1.12);
hamburger.addAddition4Name("Onion", 0.69);
        System.out.println("Total price is " + hamburger.itemizeHamburger());
        System.out.println("----------------------------------------------------");
HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5);
healthyBurger.itemizeHamburger();
healthyBurger.addAddition1Name("Egg", 1);
healthyBurger.addAddition2Name("Lentils", 1);
healthyBurger.addHealthyAddition1Name("Tomato", 1);
healthyBurger.addHealthyAddition2Name("Onion", 1);
System.out.println("Total price is " + healthyBurger.itemizeHamburger());



        }

    }


