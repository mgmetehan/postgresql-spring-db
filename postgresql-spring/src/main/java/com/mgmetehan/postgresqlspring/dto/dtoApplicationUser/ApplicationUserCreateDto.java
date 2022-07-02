package com.mgmetehan.postgresqlspring.dto.dtoApplicationUser;

import lombok.Data;

@Data
public class ApplicationUserCreateDto {
    private String clientSecret;

    private String clientKey;

    public ApplicationUserCreateDto(String clientSecret, String clientKey) {
        this.clientSecret = clientSecret;
        this.clientKey = clientKey;
    }
}
