package com.mgmetehan.postgresqlspring.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@Table(name = "Integration_Log")
public class IntegrationLog {
    @Id
    @SequenceGenerator(name = "seq_IntegrationLog", allocationSize = 1)
    @GeneratedValue(generator = "seq_IntegrationLog", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Enumerated
    private Process process;

    @Enumerated
    private Service service;

    @Enumerated
    private Status status;

    private String request;

    private String response;

    private String description;

    private String duration;

    private String url;

    public enum Process {
        LOGIN, ACCOUNT_CREATE
    }

    public enum Service {
        DSS_CRM, SARDIS
    }

    public enum Status {
        SUCCESS, ERROR, MOCK
    }

}