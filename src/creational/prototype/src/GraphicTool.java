package creational.prototype.src;

public class GraphicTool {

    private Graphic prototype;

    /**
     * Create a graphic tool using prototype
     *
     * @param prototype
     */
    public GraphicTool(Graphic prototype) {
        this.prototype = prototype;
    }

    /**
     * Method internal to the framework
     *
     * @return
     */
    protected Graphic createGraphic() {
        return prototype.clone();
    }

    public void setPrototype(Graphic prototype) {
        this.prototype = prototype;
    }
}
