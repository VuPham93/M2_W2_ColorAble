public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(5.8, "yellow", false, false);
        squares[2] = new Square(8.3);

        for (Square square : squares) {
            System.out.print(square);
            square.howToColor();
        }

    }
}
