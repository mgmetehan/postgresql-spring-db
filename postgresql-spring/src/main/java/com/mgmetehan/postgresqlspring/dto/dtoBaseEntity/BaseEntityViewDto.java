package com.mgmetehan.postgresqlspring.dto.dtoBaseEntity;

import com.mgmetehan.postgresqlspring.model.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class BaseEntityViewDto {
    private Long id;
    private Date createDate = new Date();
    private String createdBy;
    private Boolean enable;
    private Long idDeleted;
    private Long transcationId;

    public BaseEntityViewDto(Long id, Date createDate, String createdBy, Boolean enable, Long idDeleted, Long transcationId) {
        this.id = id;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.enable = enable;
        this.idDeleted = idDeleted;
        this.transcationId = transcationId;
    }

    public static BaseEntityViewDto of(BaseEntity baseEntity) {
        return new BaseEntityViewDto(baseEntity.getId(), baseEntity.getCreateDate(), baseEntity.getCreatedBy(),
                baseEntity.getEnable(), baseEntity.getIdDeleted(), baseEntity.getTranscationId());
    }
}
