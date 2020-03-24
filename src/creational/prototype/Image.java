package creational.prototype;

public class Image extends Graphic {

    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public Graphic clone() {
        // Create a new clone
        Image clone = new Image();
        clone.setUrl(this.url);
        return clone;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
