package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public void saveNewUser(User user);

    public void deleteUser(Long id);

    public User editUser(User user);

    public User getById(long id);

    public List<User> getAllUsers();

}
