package NewYear;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void вивестиПериметр() {
        double периметр = 2 * radius;
        System.out.println("Периметр круга:" + периметр);
    }
}
