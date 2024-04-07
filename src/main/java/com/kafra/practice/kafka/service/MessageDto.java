package com.kafra.practice.kafka.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * packageName    : com.kafra.practice.kafka.service
 * fileName       : MessageDto
 * author         : GAMJA
 * date           : 2024/04/06
 * description    : 메세지 전달
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/04/06        GAMJA       최초 생성
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class MessageDto {
    private String title = "";
    private String content = "";
}
