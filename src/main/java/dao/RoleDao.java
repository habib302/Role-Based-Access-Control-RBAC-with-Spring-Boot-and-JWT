package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import model.Role;

public interface RoleDao extends JpaRepository<Role, Long>{
	Role findRoleByName(String name);
}
