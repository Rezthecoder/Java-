public class Ford extends Bus{

    public Ford(String name, int cylinders) {
        super(name, cylinders);

    }

    @Override
    public String startEngine() {
        return "Ford startEngine() is running";
    }

    @Override
    public String accelerate() {
        return  "Ford accelerate() is running";
    }

    @Override
    public String brake() {
        return "Ford brake() is running";
    }

}
