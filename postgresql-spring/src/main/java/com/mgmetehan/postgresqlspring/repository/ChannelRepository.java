package com.mgmetehan.postgresqlspring.repository;

import com.mgmetehan.postgresqlspring.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel,Long> {
}
