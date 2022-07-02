package com.mgmetehan.postgresqlspring.service.serviceImpl;

import com.mgmetehan.postgresqlspring.dto.dtoBaseEntity.BaseEntityCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoBaseEntity.BaseEntityViewDto;
import com.mgmetehan.postgresqlspring.exception.NotFoundException;
import com.mgmetehan.postgresqlspring.model.BaseEntity;
import com.mgmetehan.postgresqlspring.repository.BaseEntityRepository;
import com.mgmetehan.postgresqlspring.service.BaseEntityService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BaseEntityServiceImpl implements BaseEntityService {
    private final BaseEntityRepository baseEntityRepository;

    public BaseEntityServiceImpl(BaseEntityRepository baseEntityRepository) {
        this.baseEntityRepository = baseEntityRepository;
    }


    @Override
    public BaseEntityViewDto getBaseEntityById(Long id) {
        Optional<BaseEntity> optionalBaseEntity = baseEntityRepository.findById(id);
        BaseEntity baseEntity = optionalBaseEntity.orElseThrow(() -> new NotFoundException("Not Found Exception"));
        return BaseEntityViewDto.of(baseEntity);
    }

    @Override
    public BaseEntityViewDto createBaseEntity(BaseEntityCreateDto newBaseEntity) {
        BaseEntity saveBaseEntity = new BaseEntity();
        saveBaseEntity.setCreatedBy(newBaseEntity.getCreatedBy());
        saveBaseEntity.setEnable(newBaseEntity.getEnable());
        saveBaseEntity.setIdDeleted(newBaseEntity.getIdDeleted());
        saveBaseEntity.setTranscationId(newBaseEntity.getTranscationId());

        BaseEntity baseEntity = baseEntityRepository.save(saveBaseEntity);
        return BaseEntityViewDto.of(baseEntity);
    }
}
