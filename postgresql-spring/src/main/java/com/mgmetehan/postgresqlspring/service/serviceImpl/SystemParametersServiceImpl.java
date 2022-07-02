package com.mgmetehan.postgresqlspring.service.serviceImpl;

import com.mgmetehan.postgresqlspring.dto.dtoSystemParameters.SystemParametersViewDto;
import com.mgmetehan.postgresqlspring.exception.NotFoundException;
import com.mgmetehan.postgresqlspring.model.SystemParameters;
import com.mgmetehan.postgresqlspring.repository.SystemParametersRepository;
import com.mgmetehan.postgresqlspring.service.SystemParametersService;

import java.util.Optional;

public class SystemParametersServiceImpl implements SystemParametersService {

    private final SystemParametersRepository systemParametersRepository;

    public SystemParametersServiceImpl(SystemParametersRepository systemParametersRepository) {
        this.systemParametersRepository = systemParametersRepository;
    }

    @Override
    public SystemParametersViewDto getSystemParametersId(Long id) {
        Optional<SystemParameters> optionalSystemParameters = systemParametersRepository.findById(id);
        SystemParameters systemParameters = optionalSystemParameters.orElseThrow(() -> new NotFoundException("Not Found Exception"));
        return SystemParametersViewDto.of(systemParameters);
    }
}
