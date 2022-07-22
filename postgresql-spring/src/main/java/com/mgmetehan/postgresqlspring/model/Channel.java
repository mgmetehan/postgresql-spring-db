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
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated
    private Name name;

    @ManyToMany(mappedBy = "channels", fetch = FetchType.LAZY)
    private List<Account> accounts;

    @ManyToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private List<User> users;

    enum Name {
        DBS, YAANI, BIP_MEET, LIFE_BOX, SUIT,
    }
}
