public class Reactangle {
    private  double length;
    private double width;
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return  this.width;
    }

    public void setLength(double length){
        this.length = length;
    }
    public  void  setWidth(double width){
        this.width = width;
    }

    public Reactangle(){
        this.length = 1;
        this.width = 1;
    }
    public Reactangle(double length, double width)
    {
        this.length = length>0?length:0;
        this.width = width>0?width:0;
    }
    public double getArea(){
        return this.length*this.width;
    }

}
