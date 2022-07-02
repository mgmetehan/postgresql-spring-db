package com.mgmetehan.postgresqlspring.service;

import com.mgmetehan.postgresqlspring.dto.dtoBaseEntity.BaseEntityCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoBaseEntity.BaseEntityViewDto;

public interface BaseEntityService {
    BaseEntityViewDto getBaseEntityById(Long id);

    BaseEntityViewDto createBaseEntity(BaseEntityCreateDto newBaseEntity);

}
