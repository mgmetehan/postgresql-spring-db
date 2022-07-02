package com.mgmetehan.postgresqlspring.dto.dtoKafkaEventLog;

import lombok.Data;

@Data
public class KafkaEventLogCreateDto {
    private String event;

    private Long channelId;

    private Boolean isSend;

    public KafkaEventLogCreateDto(String event, Long channelId, Boolean isSend) {
        this.event = event;
        this.channelId = channelId;
        this.isSend = isSend;
    }
}
