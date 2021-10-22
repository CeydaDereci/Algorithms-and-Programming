public class Triangle extends Shape{

    int a;
    int b;
    int c;

    public Triangle(int x, int y, int a, int b, int c){
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    double getArea() {
        double p;
        double area;
        p = (double)(a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    @Override
    double getPerimeter() {
        double perimeter;
        perimeter = a + b + c;
        return perimeter;
    }

    @Override
    public boolean contains(int x, int y) {
        int distanceX = Math.abs(getX() - x);
        int distanceY = Math.abs(getY() - y);
        return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2)) <= Math.max(a, Math.max(b, c));
    }


}
