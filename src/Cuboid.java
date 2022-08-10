public class Cuboid extends Reactangle{
    private double height;
    public void setHeight(double height){
        this.height = height>0?height:0;
    }
    public Cuboid(double length,double width,double height){
        super(length,width);
        this.height = height>0?height:0;
    }
public double getHeight(){
        return this.height;
}
public double getVolume(){
        return this.getArea()*height;
}
}
