package com.kafra.practice.kafka.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListeners;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * packageName    : com.kafra.practice.kafka.service
 * fileName       : KafkaProducer
 * author         : GAMJA
 * date           : 2024/04/06
 * description    : producer에서 전송하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/04/06        GAMJA       최초 생성
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaService {

    private static final String TOPIC = "exam-topic";

    private final KafkaTemplate<String,Object> kafkaTemplate;

    public void sendMessage(MessageDto messageDto) throws JsonProcessingException {
        log.info("###### message info : {}",messageDto.toString());
        ObjectMapper objectMapper = new ObjectMapper();
        this.kafkaTemplate.send(TOPIC,objectMapper.writeValueAsString(messageDto));
    }

    @KafkaListener(topics = TOPIC, groupId = "foo")
    public void consume(String message) throws IOException {
        log.info("Consumed message : {}",message);
    }

}
