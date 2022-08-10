public class Circle {
    private  double radius;
    private String color;

    public double getRadius(){
        return radius;
    }
   public Circle(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public Circle(double radius){
        this.radius = radius>0?radius:0;
    }
public double getArea(){
        return Math.PI*radius*radius;

}

}
