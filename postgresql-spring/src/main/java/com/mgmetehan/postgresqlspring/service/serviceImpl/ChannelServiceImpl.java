package com.mgmetehan.postgresqlspring.service.serviceImpl;

import com.mgmetehan.postgresqlspring.exception.NotFoundException;
import com.mgmetehan.postgresqlspring.model.Channel;
import com.mgmetehan.postgresqlspring.repository.ChannelRepository;
import com.mgmetehan.postgresqlspring.service.ChannelService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChannelServiceImpl implements ChannelService {
    private final ChannelRepository channelRepository;

    public ChannelServiceImpl(ChannelRepository channelRepository) {
        this.channelRepository = channelRepository;
    }

    @Override
    public Channel getChannelById(Long id) {
        Optional<Channel> optionalChannel = channelRepository.findById(id);
        Channel channel = optionalChannel.orElseThrow(() -> new NotFoundException("Not Found Exception"));
        return channel;
    }

    @Override
    public Channel createChannel(Channel newChannel) {
        Channel saveChannel = new Channel();
        saveChannel.setName(newChannel.getName());

        Channel channel = channelRepository.save(saveChannel);
        return channel;
    }
}
