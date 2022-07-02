package com.mgmetehan.postgresqlspring.shared;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public final class GenericResponse {
    private String message;
}