

import org.springframework.jdbc.datasource.DriverManagerDataSource

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

/**
 * @author Lalit
 * @since CGW 2.0
 */
class ThreadLocalDS extends DriverManagerDataSource {

    private static ThreadLocal<String[]> URL_USERNAME_AND_PASSWORD = new ThreadLocal<String[]>()

    String url
    String defaultUsername
    String defaultPassword

    static void set(String url,String username, String password) {
        URL_USERNAME_AND_PASSWORD.set([url.toString(), username.toString(), password.toString()] as String[])
    }

    Connection getConnection() throws SQLException {
        String[] usernameAndPassword = URL_USERNAME_AND_PASSWORD.get()
        if (!usernameAndPassword) {
            usernameAndPassword = [url, defaultUsername, defaultPassword] as String[]
        }
        return DriverManager.getConnection(usernameAndPassword[0], usernameAndPassword[1], usernameAndPassword[2])
    }

    Connection getConnection(String username, String password) throws SQLException {
        return getConnection()
    }

    static void clear() {
        URL_USERNAME_AND_PASSWORD.remove();
    }

}
