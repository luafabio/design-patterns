package creational.builder.src;

public class MongoDbQuery implements Query {

    private String from;

    private String where;

    public void setFrom(String from) {
        this.from = "from: " + from;
    }

    public void setWhere(String where) {
        this.where = "where " + where;
    }

    @Override
    public void execute() {
        System.out.println("Executing MongoDbQuery: " + from + where);
    }
}
