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


/*    private Process process = Process.valueOf("LOGIN");


    private Service service = Service.valueOf("SARDIS");


    private Status status = Status.valueOf("ERROR");*/

    private String request;

    private String response;

    private String description;

    private String duration;

    private String url;


/*    enum Process {
        LOGIN, ACCOUNT_CREATE
    }

    enum Service {
        DSS_CRM, SARDIS
    }

    enum Status {
        SUCCESS, ERROR, MOCK
    }*/

}
