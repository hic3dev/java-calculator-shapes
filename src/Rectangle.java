public class Rectangle
{
    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    private double width;

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    private double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    public double Area()
    {
        return  width* height;
    }
    public double getPerimtr()
    {
        return 2 * (width + height);
    }
}