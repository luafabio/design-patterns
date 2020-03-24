package creational.builder.src;

public interface QueryBuilder {

    void from(String from);

    void where(String where);

    Query getQuery();
}
