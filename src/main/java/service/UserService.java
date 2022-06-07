package service;

import java.util.List;

import model.User;
import model.UserDto;

public interface UserService {
	User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
