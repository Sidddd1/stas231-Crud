package ru.stas.dao;



import ru.stas.model.User;

import java.util.List;

public interface UserDao {
    List<User> listUsers();
    User findById(int id);
    void save(User user);
    void update(User user);
    void delete(User user);
}
