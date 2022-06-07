package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import model.User;


public interface UserDao extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
