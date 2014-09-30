package multiple.datasource.plugin
/**
 * SQL to create on both databases
 * CREATE TABLE book
 (
 id bigint NOT NULL,
 version bigint NOT NULL,
 name character varying(255) NOT NULL,
 rate integer NOT NULL,
 CONSTRAINT book_pkey PRIMARY KEY (id)
 )
 WITH (
 OIDS=FALSE
 );
 ALTER TABLE book
 OWNER TO postgres;
 */
class Book {

    String name
    Integer rate

    static constraints = {
    }
}
