package ru.valaubr.behavioral.chainofresponsibility.chains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.valaubr.behavioral.chainofresponsibility.MessageDto;

@Getter
@Setter
@AllArgsConstructor
public abstract class Handler {

    private Handler next;
    public abstract void handleRequest(MessageDto messageDto);

    public void callNext(MessageDto messageDto) {
        if (next != null) {
            next.handleRequest(messageDto);
        } else {
            System.out.println("No handler for message type " + messageDto.getMessageType());
        }
    }
}
