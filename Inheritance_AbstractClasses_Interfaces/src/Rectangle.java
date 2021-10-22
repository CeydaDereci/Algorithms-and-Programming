public class Rectangle extends Shape {

    int width;
    int height;
    int sides;

    public Rectangle(int x, int y, int width,int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.sides = width + height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        double perimeter;
        perimeter = (width + height) * 2;
        return perimeter;
    }

    @Override
    public boolean contains(int x, int y) {
        return (x >= this.x) && (x <= this.x + width) && (y <= this.y) && (y >= this.y - height);
    }
}
