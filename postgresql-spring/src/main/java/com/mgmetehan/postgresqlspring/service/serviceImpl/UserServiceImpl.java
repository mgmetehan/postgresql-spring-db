package com.mgmetehan.postgresqlspring.service.serviceImpl;

import com.mgmetehan.postgresqlspring.dto.dtoSystemParameters.SystemParametersViewDto;
import com.mgmetehan.postgresqlspring.exception.NotFoundException;
import com.mgmetehan.postgresqlspring.model.SystemParameters;
import com.mgmetehan.postgresqlspring.model.User;
import com.mgmetehan.postgresqlspring.repository.UserRepository;
import com.mgmetehan.postgresqlspring.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        User user = optionalUser.orElseThrow(() -> new NotFoundException("Not Found Exception"));
        return user;
    }

    @Override
    public User createUser(User newUser) {
        User saveUser = new User();
        saveUser.setAccount(newUser.getAccount());
        saveUser.setIsTenantManager(newUser.getIsTenantManager());
        saveUser.setName(newUser.getName());
        saveUser.setSurname(newUser.getSurname());
        saveUser.setEmail(newUser.getEmail());
        saveUser.setMsisdn(newUser.getMsisdn());
        saveUser.setChannel(newUser.getChannel());
        saveUser.setRoomName(newUser.getRoomName());
        saveUser.setRole(newUser.getRole());

        User user = userRepository.save(saveUser);
        return user;
    }
}
