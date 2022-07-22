package com.mgmetehan.postgresqlspring.service.serviceImpl;

import com.mgmetehan.postgresqlspring.dto.dtoApplicationUser.ApplicationUserViewDto;
import com.mgmetehan.postgresqlspring.exception.NotFoundException;
import com.mgmetehan.postgresqlspring.model.ApplicationUser;
import com.mgmetehan.postgresqlspring.model.Role;
import com.mgmetehan.postgresqlspring.repository.RoleRepository;
import com.mgmetehan.postgresqlspring.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role getRoleById(Long id) {
        Optional<Role> optionalRole = roleRepository.findById(id);
        Role role = optionalRole.orElseThrow(() -> new NotFoundException("Not Found Exception"));
        return role;
    }

    @Override
    public Role createRole(Role newRole) {
        Role saveRole = new Role();
        saveRole.setName(newRole.getName());

        Role role = roleRepository.save(saveRole);
        return role;
    }
}
