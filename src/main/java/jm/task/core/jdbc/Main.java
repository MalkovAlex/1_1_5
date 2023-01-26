package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.SessionFactory;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Петр", "Первый", (byte) 40);
        userService.saveUser("Николай", "Второй", (byte) 44);
        userService.saveUser("Сигизмунд", "Третий", (byte) 33);
        userService.saveUser("Владимир", "ЯсноСолнышко", (byte) 38);

        userService.removeUserById(1L);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();




    }
}
