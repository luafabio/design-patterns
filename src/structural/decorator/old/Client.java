package structural.decorator.old;

public class Client {
    public static void main(String[] args) {

        IconWindow iconWindow = new IconWindow();
        iconWindow.draw();

        ScrollBarWindow scrollBarWindow = new ScrollBarWindow();
        scrollBarWindow.draw();

        // Creation without duplicate window
        IconScrollBarWindow iconScrollBarWindow = new IconScrollBarWindow();
        iconScrollBarWindow.draw();
    }
}
