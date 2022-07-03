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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Bir userın birden fazla hesabı vardır many to one
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(name = "is_tenant_manager")
    private String isTenantManager;

    private String name;
    private String surname;
    private String email;
    private String msisdn;

    //bir userın birden fazla channeli var bir channelın birden fazla userı
    @ManyToMany
    @JoinColumn(name = "channel_id")
    private List<Channel> channel;

    @Column(name = "room_name")
    private String roomName;

    // Bir userın bir rolü bir rolun çok userı  one to many
    @OneToMany
    @JoinColumn(name = "role_id")
    private Role role;

}
