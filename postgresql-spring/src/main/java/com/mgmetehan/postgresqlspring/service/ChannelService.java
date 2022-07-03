package com.mgmetehan.postgresqlspring.service;

import com.mgmetehan.postgresqlspring.model.Channel;

public interface ChannelService {
    Channel getChannelById(Long id);

    Channel createChannel(Channel newChannel);
}
