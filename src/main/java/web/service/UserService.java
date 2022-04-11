package web.service;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.List;

@Component
public interface UserService {
    public void saveNewUser(User user);

    public void deleteUser(Long id);

    public User editUser(User user);

    public User getById(long id);

    public List<User> getAllUsers();
}
