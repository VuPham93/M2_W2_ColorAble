public class Rectangle extends Shape implements ColorAble{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled, boolean colored) {
        super(color, filled, colored);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public void howToColor() {
        if (this.isColorAble())
            System.out.println(" | Color all four sides.");
        else
            System.out.println(" | Unable to change color.");
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth()
                + " | length = " + getLength()
                + " | area = " + getArea()
                + " | colored status = " + isColorAble();
    }
}
