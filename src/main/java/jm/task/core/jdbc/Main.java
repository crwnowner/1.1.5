package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.saveUser("Игорь", "Игорев", (byte) 23);
        userServiceImpl.saveUser("Максим", "Максимов", (byte) 24);
        userServiceImpl.saveUser("Олег", "Олегов", (byte) 25);
        userServiceImpl.saveUser("Ибрагим", "Ибрагимов", (byte) 26);
        for (User user : userServiceImpl.getAllUsers()) {
            System.out.println(user.toString());
        }
        userServiceImpl.cleanUsersTable();
        userServiceImpl.dropUsersTable();
    }
}
