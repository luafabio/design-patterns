package creational.builder.src;

public class QueryBuildDirector {

    /**
     * Create a query bases on the from and the where
     * @param from
     * @param where
     * @param builder to define end result of the query of the representation of the query
     * @return Query
     */
    public Query buildQuery(String from, String where, QueryBuilder builder) {
        builder.from(from);
        builder.where(where);
        return builder.getQuery();
    }
}
