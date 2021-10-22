import java.util.Scanner;
public class ShapeTester {
    public static void main(String[] args){

        ShapeContainer s = new ShapeContainer();

        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("1- Create an empty set of shapes \n2- Add Shape \n3- Print information \n4- Find first \n5- Remove \n6-Exit");
        System.out.println("Enter your choice: ");
        choice = scan.nextInt();

        do{
            if(choice == 1){
                s = new ShapeContainer();
                System.out.println("An empty set of shapes created.");
            }
            else if(choice == 2){
                int shapeChoice;
                System.out.println("\n1- Rectangle \n2- Circle \n3-Square \n4- Triangle \nChoose the shape you want to add: ");
                shapeChoice = scan.nextInt();
                if(shapeChoice == 1){
                    int width;
                    int height;
                    int x;
                    int y;

                    System.out.println("Enter location: ");
                    x = scan.nextInt();
                    y = scan.nextInt();

                    System.out.println("Enter width and height: ");
                    width = scan.nextInt();
                    height = scan.nextInt();

                    Shape rectangle = new Rectangle(x,y,width, height);
                    s.add(rectangle);
                }
                else if(shapeChoice == 2){
                    int radius;
                    int x;
                    int y;

                    System.out.println("Enter location: ");
                    x = scan.nextInt();
                    y = scan.nextInt();

                    System.out.println("Enter radius: ");
                    radius = scan.nextInt();
                    Shape circle = new Circle(x,y,radius);
                    s.add(circle);
                }
                else if(shapeChoice == 3){
                    int side;
                    int x;
                    int y;

                    System.out.println("Enter location: ");
                    x = scan.nextInt();
                    y = scan.nextInt();

                    System.out.println("Enter side: ");
                    side = scan.nextInt();

                    Shape square = new Square(x,y,side);
                    s.add(square);
                }
                else if(shapeChoice == 4){
                    int a;
                    int b;
                    int c;
                    int x;
                    int y;


                    System.out.println("Enter location: ");
                    x = scan.nextInt();
                    y = scan.nextInt();

                    System.out.println("Enter sides: ");
                    a = scan.nextInt();
                    b = scan.nextInt();
                    c = scan.nextInt();

                    if(((a + b) > c) && ((a + c) > b) && ((b + c) > a)){
                        Shape triangle = new Triangle(x, y, a, b, c);
                        s.add(triangle);
                    }
                    else
                        System.out.println("Invalid Triangle!");
                }
                System.out.println("Shape added to the shape container. ");
            }
            else if(choice == 3){
                System.out.println(s.toString());
            }
            else if(choice == 4){
                int x;
                int y;
                System.out.println("Enter location: ");
                x = scan.nextInt();
                y = scan.nextInt();
                System.out.println(s.getFirstShape(x, y));
            }
            else if (choice == 5){
                s.removeSelectedShapes();
                System.out.println("All selected shapes are removed.");
            }

            System.out.println("1- Create an empty set of shapes \n2- Add Shape \n3- Print information \n4- Find first  \n5- Remove \n6-Exit");
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
        }
        while(choice != 6);
        System.out.println("Good Bye!");
    }
}
