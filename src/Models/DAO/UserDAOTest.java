package Models.DAO;

import Models.Beans.Users;
import org.junit.Ignore;
import org.junit.Test;

import java.sql.SQLException;

class UserDAOTest {

    public UserDAOTest() {

    }

    @Test
    void create() throws SQLException {

        Users us = new Users();
        UserDAO dao = new UserDAO();

       if (dao.create(us)); {
            System.out.println("User inserido com sucesso");
        } {

        }

    }

    @Ignore
    void read() {
    }

    @Ignore
    void update() {
    }

    @Ignore
    void updatePass() {
    }

    @Ignore
    void delete() {
    }
}