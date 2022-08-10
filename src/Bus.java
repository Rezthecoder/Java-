public class Bus {
    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public Bus(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;

    }
    public String startEngine(){
        return "Start enginne() is running";
    }
    public String accelerate(){
        return "Accelerate() is running";
    }
    public  String  brake(){
        return "Brake() is running";

    }


}
