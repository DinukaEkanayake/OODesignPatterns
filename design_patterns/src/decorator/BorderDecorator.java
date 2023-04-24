package decorator;

public class BorderDecorator extends ShapeDecorator{

    String borderColor;
    public BorderDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    public void draw(){
        decoratorShape.draw();
        System.out.println("setting the border");

    }

}
