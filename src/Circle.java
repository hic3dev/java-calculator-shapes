public class Circle
{
    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    public  Circle(double radius)
    {
        this.radius = radius;
    }
    public double Area()
    {
        return Math.PI * radius * radius;
    }

}
