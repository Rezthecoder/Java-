public class Toyota extends Bus{

    public Toyota(String name, int cylinders) {
        super(name, cylinders);

    }

    @Override
    public String startEngine() {
        return "Toyota startEngine() is running";
    }

    @Override
    public String accelerate() {
        return  "Toyota accelerate() is running";
    }

    @Override
    public String brake() {
        return "Toyota brake() is running";
    }
}
