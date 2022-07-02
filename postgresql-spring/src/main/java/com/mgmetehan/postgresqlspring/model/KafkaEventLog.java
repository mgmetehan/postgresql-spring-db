package com.mgmetehan.postgresqlspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "kafka_event_log")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KafkaEventLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String event;

    @Column(name = "channel_id")
    private Long channelId;

    @Column(name = "is_send")
    private Boolean isSend;
}



