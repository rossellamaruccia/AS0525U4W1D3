package Rectangle_package;

public class Rectangle {
    // lista Attributi ---------------
    private final int height;
    private final int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        int perimeter = getPerimeter();
        int area = getArea();
    }

    // lista Metodi -------------
    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }

    public void printPerimeterAndArea() {
        System.out.println("Perimeter and Area: " + getPerimeter() + " and " + getArea());
    }

    public void printSum(Rectangle r2) {
        System.out.println("Sum of the perimeters: " + getPerimeter() + ", " + r2.getPerimeter());
        System.out.println("Sum of the areas: " + getArea() + ", " + r2.getArea());
    }
}
