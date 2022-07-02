package com.mgmetehan.postgresqlspring.dto.dtoSystemParameters;

import com.mgmetehan.postgresqlspring.model.SystemParameters;
import lombok.Data;

@Data
public class SystemParametersViewDto {

    private Long id;

    private int key;

    private String value;

    private String description;

    public SystemParametersViewDto(Long id, int key, String value, String description) {
        this.id = id;
        this.key = key;
        this.value = value;
        this.description = description;
    }

    public static SystemParametersViewDto of(SystemParameters systemParameters) {
        return new SystemParametersViewDto(systemParameters.getId(), systemParameters.getKey(), systemParameters.getValue(), systemParameters.getDescription());
    }
}
