package structural.adapter.old;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        // Either the LegacyRectangle.class and Rectangle.class have different method's names witch make very difficult to use in a polymorphic way
    }

    public void calculateRectangleSize(Rectangle rectangle) {
        System.out.println("Rectangle size: " + rectangle.determineSize());
    }
}
