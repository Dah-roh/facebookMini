import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    /**
     *  Method used to verify login
     * @param username
     * @param password
     * @return
     */
    @Override
    public boolean login(String username, String password) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            //1. Get database connection
            conn = JDBCUtils.getConn();
            //2. Precompile sql statements
            String sql = "select * from t_user where username=? and password=?";
            ps = conn.prepareStatement(sql);
            //3. Fill placeholder
            ps.setString(1,username);
            ps.setString(2,password);

            //4. Execute query statement
            rs = ps.executeQuery();
            //5. If there are objects in the result set, it will return true if found. If not. Then return false
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //6. Close resources
            JDBCUtils.release(conn,ps,rs);
        }

        return false;
    }
}
