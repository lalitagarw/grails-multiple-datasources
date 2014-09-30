dataSource {
    url = "jdbc:postgresql://localhost:5432/db-2"
    driverClassName = "org.postgresql.Driver"
    dialect="org.hibernate.dialect.PostgreSQLDialect"
    loggingSql=false
}
hibernate {
    cache.use_second_level_cache = false
    cache.use_query_cache = false
    cache.provider_class = "net.sf.ehcache.hibernate.EhCacheProvider"
}
// environment specific settings
environments {
    development {
        dataSource {
            username = "postgres"
            password = "postgres"
            loggingSql=true
            dbCreate = "update"
        }

        dataSource_odd {
            url = "jdbc:postgresql://localhost:5432/db-1"
            driverClassName = "org.postgresql.Driver"
            dialect="org.hibernate.dialect.PostgreSQLDialect"
            loggingSql=false
            username = "postgres"
            password = "postgres"
            dbCreate = "update"
        }

        dataSource_even {
            url = "jdbc:postgresql://localhost:5432/db-2"
            driverClassName = "org.postgresql.Driver"
            dialect="org.hibernate.dialect.PostgreSQLDialect"
            loggingSql=false
            username = "postgres"
            password = "postgres"
            dbCreate = "update"
        }
    }
    test {
        dataSource {
            //you must not drop the test database, as test database now has genomic load data
            username = "postgres"
            password = "postgres"
        }
    }
}