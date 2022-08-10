public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private  int currentDirection;
    public Vehicle(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public Vehicle(String size, String name){
        this.size =size;
        this.currentDirection = 0;
        this.name = name;
        this.currentVelocity=0;
    }

    public void steering(int direction){
        this.currentDirection += direction;
        System.out.println(currentDirection +"degrees");

    }
    public void move(int speed,int direction){
        this.currentVelocity = speed;
        this.currentDirection =direction;
        System.out.println("Moving at " +this.currentVelocity +"direction "+ this.currentDirection +"degrees");

    }

    public void stop(){
        this.currentVelocity = 0;
    }




}
