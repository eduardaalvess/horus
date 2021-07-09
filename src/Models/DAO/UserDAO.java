package Models.DAO;

import Database.ConnectionFactory;
import Models.Beans.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAO {

    private Connection connect = null;

    public UserDAO() {
        connect = ConnectionFactory.getConnection();
    }

    public boolean create(Users users) throws SQLException {

        String sql = "INSERT INTO usersinfo (name, email, pass, cpf, location, age, height) VALUES (?,?,?,?,?,?,?) ";

        PreparedStatement statement = null;

        try {
            statement = connect.prepareStatement(sql);
            statement.setString(1, users.getName());
            statement.setString(2, users.getEmail());
            statement.setString(3, users.getPass());
            statement.setString(4, users.getCpf());
            statement.setString(5, users.getLocation());
            statement.setInt(6, users.getAge());
            statement.setInt(7, users.getHeight());

            statement.executeUpdate();

            return true;

        } catch (SQLException sqlException) {

            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, sqlException);

            return false;
        } finally {
            ConnectionFactory.closeConnection(connect, statement);
        }
    }


    public List<Users> read() {

        String sql = "SELECT * FROM usersinfo";

        PreparedStatement statement = null;
        ResultSet rs = null;

        List<Users> users = new ArrayList<>();

        try {
            statement = connect.prepareStatement(sql);
            rs = statement.executeQuery();

            while (rs.next()) {

                Users user = new Users();

                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPass(rs.getString("pass"));
                user.setCpf(rs.getString("cpf"));
                user.setLocation(rs.getString("location"));
                user.setAge(rs.getInt("age"));
                user.setHeight(rs.getInt("height"));


            }
        } catch (SQLException sqlException) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, sqlException);
        }
        finally {
            ConnectionFactory.closeConnection(connect, statement, rs);
        }

        return users;
    }



}
