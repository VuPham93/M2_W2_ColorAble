public class Square extends Rectangle implements ColorAble{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled, boolean colored) {
        super(side, side, color, filled, colored);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void howToColor() {
        super.howToColor();
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide()
                + " | area = " + getArea()
                + " | filled status = " + isFilled();
    }
}
