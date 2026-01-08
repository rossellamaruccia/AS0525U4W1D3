import Rectangle_package.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Rectangle rectangle1 = new Rectangle(10, 20);
    Rectangle rectangle2 = new Rectangle(5, 6);
    rectangle1.printPerimeterAndArea();
    rectangle2.printPerimeterAndArea();
    rectangle1.printSum(rectangle2);
    }
