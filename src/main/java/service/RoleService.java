package service;

import model.Role;

public interface RoleService {
	Role findByName(String name);
}
