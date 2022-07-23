package com.mgmetehan.postgresqlspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.lang.reflect.Type;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;




    private Double price;


    @Column(name = "license_count")
    private int licenseCount;

    @Column(name = "used_license_count")
    private int usedLicenseCount;

    @Enumerated
    @Column(name = "subscription_type")
    private Type type;

    @Column(name = "sardis_id")
    private Long sardisId;

    @Column(name = "with_drawal_fee")
    private Double withDrawalFee;

    enum Type {
    }

}
