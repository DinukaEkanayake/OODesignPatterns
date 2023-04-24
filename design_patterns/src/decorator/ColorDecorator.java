package decorator;

public class ColorDecorator extends ShapeDecorator {

    private String color;

    public ColorDecorator(Shape decoratorShape,String color) {
        super(decoratorShape);
        this.color=color;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        System.out.println("setting the color "+color);
    }
}
