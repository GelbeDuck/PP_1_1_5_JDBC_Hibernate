package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 20);
        userService.saveUser("Пётр", "Петров", (byte) 25);
        userService.saveUser("Василий", "Васильев", (byte) 31);
        userService.saveUser("Юрий", "Сидоров", (byte) 38);
        List<User> userList = userService.getAllUsers();
        System.out.println("Юзеры в бд: ");
        for (User user : userList) {
            System.out.println(user);
        }
        userService.removeUserById(1);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

