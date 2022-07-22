package com.mgmetehan.postgresqlspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Account> accounts = new ArrayList<>();

    @Column(name = "is_tenant_manager")
    private String isTenantManager;

    private String name;
    private String surname;
    private String email;
    private String msisdn;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_channel", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "channel_id"))
    private List<User> users;


    @Column(name = "room_name")
    private String roomName;

    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;

}