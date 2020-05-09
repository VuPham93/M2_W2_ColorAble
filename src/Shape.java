public class Shape {
    private String color = "green";
    private boolean filled = true;
    private boolean colorAble = true;

    public Shape() {
    }

    public Shape(String color, boolean filled, boolean colored) {
        this.color = color;
        this.filled = filled;
        this.colorAble = colored;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isColorAble() {
        return colorAble;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled")
                + (isColorAble() ? "colored" : "not colored");
    }


}
