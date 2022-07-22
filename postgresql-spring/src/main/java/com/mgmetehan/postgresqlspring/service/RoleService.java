package com.mgmetehan.postgresqlspring.service;

import com.mgmetehan.postgresqlspring.model.Role;

public interface RoleService {
    Role getRoleById(Long id);

    Role createRole(Role newRole);

}
