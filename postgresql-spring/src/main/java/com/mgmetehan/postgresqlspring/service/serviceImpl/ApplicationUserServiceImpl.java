package com.mgmetehan.postgresqlspring.service.serviceImpl;

import com.mgmetehan.postgresqlspring.dto.dtoApplicationUser.ApplicationUserCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoApplicationUser.ApplicationUserViewDto;
import com.mgmetehan.postgresqlspring.exception.NotFoundException;
import com.mgmetehan.postgresqlspring.model.ApplicationUser;
import com.mgmetehan.postgresqlspring.repository.ApplicationUserRepository;
import com.mgmetehan.postgresqlspring.service.ApplicationUserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplicationUserServiceImpl implements ApplicationUserService {
    private final ApplicationUserRepository applicationUserRepository;

    public ApplicationUserServiceImpl(ApplicationUserRepository applicationUserRepository) {
        this.applicationUserRepository = applicationUserRepository;
    }

    @Override
    public ApplicationUserViewDto getApplicationUserById(Long id) {
        Optional<ApplicationUser> optionalApplicationUser = applicationUserRepository.findById(id);
        ApplicationUser applicationUser = optionalApplicationUser.orElseThrow(() -> new NotFoundException("Not Found Exception"));
        return ApplicationUserViewDto.of(applicationUser);
    }

    @Override
    public ApplicationUserViewDto createApplicationUser(ApplicationUserCreateDto newApplicationUser) {
        ApplicationUser saveApplicationUser = new ApplicationUser();
        saveApplicationUser.setClientSecret(newApplicationUser.getClientSecret());
        saveApplicationUser.setClientKey(newApplicationUser.getClientKey());

        ApplicationUser applicationUser = applicationUserRepository.save(saveApplicationUser);
        return ApplicationUserViewDto.of(applicationUser);
    }
}
