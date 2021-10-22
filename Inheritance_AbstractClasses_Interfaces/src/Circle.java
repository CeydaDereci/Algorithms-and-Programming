public class Circle extends Shape{

    int radius;

    public Circle(int x, int y,int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    double getArea() {
        double area;
        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    double getPerimeter() {
        double perimeter;
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public boolean contains(int x, int y) {
        double distance;
        distance = (x - this.x) * (x - this.x)  + (y - this.y) * (y - this.y);
        return radius * radius <= distance;
    }
}
