package com.mgmetehan.postgresqlspring.service.serviceImpl;

import com.mgmetehan.postgresqlspring.dto.dtoSystemParameters.SystemParametersCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoSystemParameters.SystemParametersViewDto;
import com.mgmetehan.postgresqlspring.exception.NotFoundException;
import com.mgmetehan.postgresqlspring.model.SystemParameters;
import com.mgmetehan.postgresqlspring.repository.SystemParametersRepository;
import com.mgmetehan.postgresqlspring.service.SystemParametersService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
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

    @Override
    public SystemParametersViewDto createSystemParameters(SystemParametersCreateDto newSystemParameters) {
        SystemParameters saveSystemParameters = new SystemParameters();
        saveSystemParameters.setKey(newSystemParameters.getKey());
        saveSystemParameters.setValue(newSystemParameters.getValue());
        saveSystemParameters.setDescription(newSystemParameters.getDescription());

        SystemParameters systemParameters = systemParametersRepository.save(saveSystemParameters);
        return SystemParametersViewDto.of(systemParameters);
    }
}
