package com.mgmetehan.postgresqlspring.repository;

import com.mgmetehan.postgresqlspring.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseEntityRepository extends JpaRepository<BaseEntity, Long> {
}
