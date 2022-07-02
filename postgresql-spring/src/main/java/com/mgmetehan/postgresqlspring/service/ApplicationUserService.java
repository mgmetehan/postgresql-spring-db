package com.mgmetehan.postgresqlspring.service;

import com.mgmetehan.postgresqlspring.dto.dtoApplicationUser.ApplicationUserCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoApplicationUser.ApplicationUserViewDto;

public interface ApplicationUserService {
    ApplicationUserViewDto getApplicationUserById(Long id);

    ApplicationUserViewDto createApplicationUser(ApplicationUserCreateDto newApplicationUser);
}
