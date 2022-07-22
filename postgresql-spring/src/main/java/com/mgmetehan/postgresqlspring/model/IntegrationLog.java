package com.mgmetehan.postgresqlspring.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "integration_log")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class IntegrationLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated
    private Process process;

    @Enumerated
    private Service service;

    @Enumerated
    private Status status;

    private String request;

    @Lob
    private String response;

    private String description;

    private String duration;

    private String url;

    enum Process {
        LOGIN, ACCOUNT_CREATE
    }

    enum Service {
        DSS_CRM, SARDIS
    }

    enum Status {
        SUCCESS, ERROR, MOCK
    }

}
