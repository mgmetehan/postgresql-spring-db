package com.mgmetehan.postgresqlspring.dto.dtoKafkaEventLog;

import com.mgmetehan.postgresqlspring.model.KafkaEventLog;
import lombok.Data;

@Data
public class KafkaEventLogViewDto {
    private Long id;

    private String event;

    private Long channelId;

    private Boolean isSend;

    public KafkaEventLogViewDto(Long id, String event, Long channelId, Boolean isSend) {
        this.id = id;
        this.event = event;
        this.channelId = channelId;
        this.isSend = isSend;
    }

  public static KafkaEventLogViewDto of(KafkaEventLog kafkaEventLog) {
        //return new KafkaEventLogViewDto(kafkaEventLog.getId(), kafkaEventLog.getEvent(), kafkaEventLog.getChannelId(), kafkaEventLog.getIsSend());
      return null;
    }
}
