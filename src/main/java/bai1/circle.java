package bai1;

public class circle {
    private double radius=1.0;

    public circle() {
    }
    public circle(double radius) {
        if(radius<=0)
        {
            throw  new RuntimeException("Error");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0)
        {
            throw  new RuntimeException("Error");
        }
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference()
    {
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                '}';
    }
}
