package com.kafra.practice.kafka.web;

import com.kafra.practice.kafka.service.KafkaService;
import com.kafra.practice.kafka.service.MessageDto;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.kafra.practice.kafka.web
 * fileName       : KafkaController
 * author         : GAMJA
 * date           : 2024/04/06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/04/06        GAMJA       최초 생성
 */
@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaService kafkaService;

    @PostMapping("/send/message")
    public ResponseEntity<?> sendMessage(final @RequestBody MessageDto messageDto) throws Exception {

        kafkaService.sendMessage(messageDto);

        return ResponseEntity.ok("send message ok ");
    }
}
