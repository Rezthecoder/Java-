public class Player {
    private String name;
    public int health;
    public int damage;

    public String getName() {
        return name;
    }

    public Player() {
    }

    public Player(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void loseHealth(int damage){
        System.out.println(name + " lost " + damage + " health.");
        this.health -= damage;
        if(health<=0){
            System.out.println("Player is knocked out");
        }


    }
    public int remainingHealth(){
        return this.health;
    }

}
