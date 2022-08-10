public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Current gear is " + currentGear);
    }

    public Car(){

    }
    public Car(String name,String size, int wheels,int doors,int gears, boolean isManual){
        super(name,size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }


    public int getWheels(){
        return  wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    public  void changeVelocity(int newVelocity, int newDirection){
       move(newVelocity,newDirection);
        System.out.println("changing velocity to "+newVelocity+"direction "+newDirection+"degrees");
    }
    }
