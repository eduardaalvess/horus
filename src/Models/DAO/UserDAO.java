package Models.DAO;

import Database.ConnectionFactory;
import Models.Beans.Users;
import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAO {

    private Connection connect;

    public UserDAO() {
        connect = ConnectionFactory.getConnection();
    }

    public boolean create(String name, String email, String pass, String cpf, String location, String age, String height) {

        PreparedStatement statement = null;

        try {
            statement = connect.prepareStatement("INSERT INTO usersinfo (name, email, pass, cpf, location, age, height) VALUES (?,?,?,?,?,?,?) ");
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, pass);
            statement.setString(4, cpf);
            statement.setString(5, location);
            statement.setString(6, age);
            statement.setString(7, height);

            statement.executeUpdate();

            System.out.println("Sucesso");


        } catch (SQLException sqlException) {

            System.out.println(sqlException);

        } finally {
            ConnectionFactory.closeConnection(connect, statement);
        }
        return false;
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

    public void update(Users users) throws SQLException {

        String sql = "UPDATE usersinfo SET name = ?, email = ?, pass = ?, location = ?, age = ?, height = ? WHERE cpf = ? ";

        PreparedStatement statement = null;

        try {
            statement = connect.prepareStatement(sql);
            statement.setString(1, users.getName());
            statement.setString(2, users.getEmail());
            statement.setString(3, users.getPass());
            statement.setString(5, users.getLocation());
            statement.setInt(6, users.getAge());
            statement.setInt(7, users.getHeight());

            statement.executeQuery();

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setContentText("Dados Atualizados com Sucesso!");

        } catch (SQLException sqlException) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Falha na atualização de dados!");
        } finally {
            ConnectionFactory.closeConnection(connect, statement);
            }
        }

    public void updatePass(Users users) throws SQLException {

        String sql = "UPDATE usersinfo SET pass = ? WHERE email = ? AND cpf = ? ";

        PreparedStatement statement = null;

        try {
            statement = connect.prepareStatement(sql);
            statement.setString(1, users.getPass());
            statement.setString(2, users.getEmail());
            statement.setString(3, users.getCpf());

            statement.executeUpdate();

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setContentText("Dados Atualizados com Sucesso!");

        } catch (SQLException sqlException) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Falha na atualização de dados!");
        } finally {
            ConnectionFactory.closeConnection(connect, statement);
        }
    }

    public void delete(Users users) {

        Connection connect = ConnectionFactory.getConnection();

        PreparedStatement statement = null;

        try {
            statement = connect.prepareStatement("DELETE FROM produto WHERE cpf = ? AND pass");
            statement.setString(1, users.getCpf());
            statement.setString(2, users.getPass());


            statement.executeUpdate();


        } catch (SQLException sqlException) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setContentText("Usuário deletado com Sucesso!");
        } finally {
            ConnectionFactory.closeConnection(connect, statement);
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Ocorreu uma falha na exclusão do usuário");
        }

    }
}
