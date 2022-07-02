package com.mgmetehan.postgresqlspring.dto.dtoApplicationUser;

import com.mgmetehan.postgresqlspring.model.ApplicationUser;
import lombok.Data;

@Data
public class ApplicationUserViewDto {
    private Long id;

    private String clientSecret;

    private String clientKey;

    public ApplicationUserViewDto(Long id, String clientSecret, String clientKey) {
        this.id = id;
        this.clientSecret = clientSecret;
        this.clientKey = clientKey;
    }

    public static ApplicationUserViewDto of(ApplicationUser applicationUser) {
        return new ApplicationUserViewDto(applicationUser.getId(), applicationUser.getClientSecret(), applicationUser.getClientKey());
    }
}
