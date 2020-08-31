import java.sql.SQLException;

public interface UserDao {
    /**
     *  Verify login method
     */
    boolean login(String username,String password) throws SQLException;
}