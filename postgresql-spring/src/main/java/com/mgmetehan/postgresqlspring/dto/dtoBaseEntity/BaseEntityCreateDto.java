package com.mgmetehan.postgresqlspring.dto.dtoBaseEntity;

import lombok.Data;

@Data
public class BaseEntityCreateDto {
    private String createdBy;

    private Boolean enable;

    private Long idDeleted;

    private Long transcationId;

    public BaseEntityCreateDto(String createdBy, Boolean enable, Long idDeleted, Long transcationId) {
        this.createdBy = createdBy;
        this.enable = enable;
        this.idDeleted = idDeleted;
        this.transcationId = transcationId;
    }
}
