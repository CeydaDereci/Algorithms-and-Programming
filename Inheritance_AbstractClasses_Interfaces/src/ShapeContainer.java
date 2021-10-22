import java.util.ArrayList;
public class ShapeContainer {

    private ArrayList<Shape> shapes;

    public ShapeContainer(){
        shapes = new ArrayList<Shape>();
    }

    public void add(Shape s) {
       shapes.add(s);
    }

    public double getArea(){
        double area;
        area = 0;
        for(Shape shape: shapes)
            area += shape.getArea();
        return area;

    }

    public double getPerimeter(){
        double perimeter;
        perimeter = 0;
        for(Shape shape: shapes)
            perimeter += shape.getPerimeter();
        return perimeter;
    }

    public Shape getFirstShape(int x, int y) {
        for (Shape shape : shapes){
            if (shape.contains(x, y)) {
                shape.setSelected(!shape.getSelected());
                return shape;
            }
        }
        return null;
    }
    public void removeSelectedShapes(){
        shapes.removeIf(Shape::getSelected);

    }

    public String toString(){
        StringBuilder str;
        str = new StringBuilder();
        for(Shape shape : shapes){
            str.append("\nShape: ");
            str.append(shape);
            str.append("\nPerimeter: ");
            str.append(shape.getPerimeter());
            str.append("\nArea: ");
            str.append(shape.getArea());
            str.append("\nSelected: ");
            str.append(shape.getSelected());
            str.append("\n\n");
        }
        str.append("Total Perimeter: ");
        str.append(getPerimeter());
        str.append("Total Area: ");
        str.append(getArea());
        return str.toString();
    }


}
