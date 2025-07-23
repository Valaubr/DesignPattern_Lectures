package ru.valaubr.behavioral.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDto {

    MessageType messageType;
    String message;

    public enum MessageType {
        MANAGER,
        HR,
        TECH_SUP,
        DIRECTOR
    }
}
