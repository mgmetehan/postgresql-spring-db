package com.mgmetehan.postgresqlspring.dto.dtoSystemParameters;

import lombok.Data;

@Data
public class SystemParametersCreateDto {
    private int key;
    private String value;
    private String description;

    public SystemParametersCreateDto(int key, String value, String description) {
        this.key = key;
        this.value = value;
        this.description = description;
    }
}
