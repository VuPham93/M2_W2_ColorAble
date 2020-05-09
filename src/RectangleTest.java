public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(2.3, 5.8);
        rectangles[2] = new Rectangle(2.5, 3.8, "orange", true, false);

        System.out.println("Pre-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.print(rectangle);
            rectangle.howToColor();
        }
    }
}
