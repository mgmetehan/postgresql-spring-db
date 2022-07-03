package com.mgmetehan.postgresqlspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "dss_crm_id")
    private Long dssCrmId;

    @ManyToMany()
    @JoinColumn(name = "channel_id")
    private List<Channel> channel;

    @Enumerated
    private Type type;

    private String name;

    private String hostname;

    @Enumerated
    private IdType idType;

    @JoinColumn(name = "id_value")
    private Long idValue;

    enum IdType {
        TCKN,
        VKN
    }

    enum Type {
        INDIVIDUAL, CORPORATE
    }
}
