package structural.decorator.src;

public class ScrollBarWindowDecorator extends WindowDecorator {

    public ScrollBarWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        System.out.println("Draw a scrollbar");
        // Important use window instead of super!
        window.draw();
    }
}
