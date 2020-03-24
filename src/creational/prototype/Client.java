package creational.prototype;

public class Client {

    public static void main(String[] args) {

        Image image = new Image();
        image.setUrl("http://test.com");

        GraphicTool tool = new GraphicTool(image);

        Graphic graphic = tool.createGraphic();

        System.out.println("Graphic instance " + graphic.getClass());
        System.out.println("Graphic url " + graphic.getUrl());

        image.setUrl("http://google.com");

        graphic = tool.createGraphic();
        System.out.println("Graphic url " + graphic.getUrl());

        Video video = new Video();
        video.setUrl("http://test.com");

        tool.setPrototype(video);

        graphic = tool.createGraphic();

        System.out.println("Graphic instance " + graphic.getClass());

    }
}
