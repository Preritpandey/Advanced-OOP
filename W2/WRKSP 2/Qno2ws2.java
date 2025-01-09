
class Shape {

    void getRectangle(int l, int b) {
        System.out.println("This method is for rectangles in the Shape class.");
    }

    void getArea(int l, int b) {
        System.out.println("This method is for calculating area in the Shape class.");
    }
}


class Circle extends Shape {
    int radius;


    public Circle(int radius) {
        this.radius = radius;
    }
    




    @Override
    void getArea(int r, int area) {
        System.out.println("Area of Circle: " + (Math.PI * r * r));
    }
}


public class Qno2ws2 {
    public static void main(String[] args) {

        Circle c1 = new Circle(10);

        c1.getArea(10, 0);
    }
}
