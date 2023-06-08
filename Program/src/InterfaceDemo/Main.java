package InterfaceDemo;

public class Main {
    public static void main(String[] args) {
        //length=10,width=12
		Rectangle rectangle = new Rectangle(10, 12);
		//radius=3
        Circle circle = new Circle(3);
        //base=4,height=6
		Triangle triangle = new Triangle(4, 6);

        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        System.out.println("Area of the Circle: " + circle.getArea());
        System.out.println("Area of the Triangle: " + triangle.getArea());
    }
}