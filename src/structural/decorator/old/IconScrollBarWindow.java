package structural.decorator.old;

public class IconScrollBarWindow extends Window {
    @Override
    public void draw() {
        System.out.println("Draw Icon");
        System.out.println("Draw ScrollBar");
        super.draw();
    }
}
