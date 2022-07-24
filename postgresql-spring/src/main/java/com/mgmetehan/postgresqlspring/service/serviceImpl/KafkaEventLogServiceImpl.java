package com.mgmetehan.postgresqlspring.service.serviceImpl;

import com.mgmetehan.postgresqlspring.dto.dtoKafkaEventLog.KafkaEventLogCreateDto;
import com.mgmetehan.postgresqlspring.dto.dtoKafkaEventLog.KafkaEventLogViewDto;
import com.mgmetehan.postgresqlspring.exception.NotFoundException;
import com.mgmetehan.postgresqlspring.model.KafkaEventLog;
import com.mgmetehan.postgresqlspring.repository.KafkaEventLogRepository;
import com.mgmetehan.postgresqlspring.service.KafkaEventLogService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KafkaEventLogServiceImpl implements KafkaEventLogService {
    private final KafkaEventLogRepository kafkaEventLogRepository;

    public KafkaEventLogServiceImpl(KafkaEventLogRepository kafkaEventLogRepository) {
        this.kafkaEventLogRepository = kafkaEventLogRepository;
    }

    @Override
    public KafkaEventLogViewDto getKafkaEventLogById(Long id) {
        Optional<KafkaEventLog> optionalKafkaEventLog = kafkaEventLogRepository.findById(id);
        KafkaEventLog kafkaEventLog = optionalKafkaEventLog.orElseThrow(() -> new NotFoundException("Not Found Exception"));
        return KafkaEventLogViewDto.of(kafkaEventLog);
    }

    @Override
    public KafkaEventLogViewDto createKafkaEventLog(KafkaEventLogCreateDto newKafkaEventLog) {
        KafkaEventLog saveKafkaEventLog = new KafkaEventLog();
        saveKafkaEventLog.setEvent(newKafkaEventLog.getEvent());
       //saveKafkaEventLog.setChannelId(newKafkaEventLog.getChannelId());
        saveKafkaEventLog.setIsSend(newKafkaEventLog.getIsSend());

        KafkaEventLog kafkaEventLog = kafkaEventLogRepository.save(saveKafkaEventLog);
        return KafkaEventLogViewDto.of(kafkaEventLog);
    }
}
