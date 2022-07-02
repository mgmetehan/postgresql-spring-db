package com.mgmetehan.postgresqlspring.dto.dtoSystemParameters;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class SystemParametersCreateDto {
    @NotBlank(message = "Key cannot be null")
    private int key;
    @NotBlank(message = "Value cannot be null")
    @Size(min = 2, max = 20, message = "Value size must be between {min} and {max}")
    private String value;
    @NotBlank(message = "Description cannot be null")
    @Size(min = 2, max = 20, message = "Description size must be between {min} and {max}")
    private String description;

    public SystemParametersCreateDto(int key, String value, String description) {
        this.key = key;
        this.value = value;
        this.description = description;
    }
}
