package structural.decorator.src;

public class IconWindowDecorator extends WindowDecorator {

    public IconWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        System.out.println("Draw a icon");
        // Important use window instead of super!
        window.draw();
    }
}
