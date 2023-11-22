package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
//        userService.saveUser("Игорь", "Игорев", (byte) 23);
//        userService.saveUser("Максим", "Максимов", (byte) 24);
//        userService.saveUser("Олег", "Олегов", (byte) 25);
//        userService.saveUser("Ибрагим", "Ибрагимов", (byte) 26);
//        for (User user : userService.getAllUsers()) {
//            System.out.println(user.toString());
//        }
//        userService.cleanUsersTable();
//        userService.dropUsersTable();
//        Util.closeConnection();
    }
}
