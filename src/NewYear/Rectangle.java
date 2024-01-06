package NewYear;

public class Rectangle extends Figure {
    private double Width;
    private double Height;

    public Rectangle(double width, double height) {
        Width = width;
        Height = height;
    }

    @Override
    public static void вивестиПериметр() {
        double периметр = 2 * (Width + Height);
        System.out.println("Периметр прямокутника: " + периметр);

    }
}
