package com.mgmetehan.postgresqlspring.service;

import com.mgmetehan.postgresqlspring.dto.dtoSystemParameters.SystemParametersCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoSystemParameters.SystemParametersViewDto;

public interface SystemParametersService {
    SystemParametersViewDto getSystemParametersId(Long id);

    SystemParametersViewDto createSystemParameters(SystemParametersCreateDto newSystemParameters);
}
