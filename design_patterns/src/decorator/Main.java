package decorator;

public class Main {

    public static void main(String[] args) {

        Circle circle=new Circle();
        ShapeDecorator circleWithBorder=new BorderDecorator(circle);
        circleWithBorder.draw();

        Triangle triangle=new Triangle();
        ShapeDecorator triangleWithBorder=new BorderDecorator(triangle);
        triangleWithBorder.draw();

        Rectangle rectangle=new Rectangle();
        ShapeDecorator rectangleWithBorder=new BorderDecorator(rectangle);
        rectangleWithBorder.draw();

        Arrow arrow=new Arrow();
        ShapeDecorator arrowWithBorder=new BorderDecorator(arrow);
        arrowWithBorder.draw();

        Circle circle2=new Circle();
        ShapeDecorator circleWithRed=new ColorDecorator(circle2,"Red");
        circleWithRed.draw();

        Rectangle rectangle2=new Rectangle();
        ShapeDecorator rectangleWithGreen=new ColorDecorator(rectangle2,"Green");
        rectangleWithGreen.draw();

        Triangle triangle2=new Triangle();
        ShapeDecorator triangle2WithBorder=new BorderDecorator(triangle2);
        ShapeDecorator triangle2WithColor=new ColorDecorator(triangle2WithBorder,"Red");
        triangle2WithColor.draw();

//        Rectangle rectangle=new Rectangle();
//        rectangle.draw();
//
//        Triangle triangle=new Triangle();
//        triangle.draw();

    }

}


//This is an application which can draw shapes like  square,circle,rectangle.