package org.itstep.services;

import org.itstep.model.User;

import java.util.Collection;

public interface AdminService {

    User createUser(String login, String password, String name, String lastName);
    User setAdmin(Long userId, Boolean isAdmin);
    User changeUserPassword(Long userId, String password);
    User changeUserName(Long userId, String name);
    User changeUserLastName(Long userId, String lastName);
    Boolean deleteUser(Long userId);
    Collection<User> getAllUsers();
    User getUserById(Long id);
    Boolean isExistUser(String login, String password);
    User getUserByLoginAndName(String login, String password);
}
