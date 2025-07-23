package ru.valaubr.behavioral.chainofresponsibility.chains;

import ru.valaubr.behavioral.chainofresponsibility.MessageDto;

public class ManagerHandler extends Handler {

    public ManagerHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(MessageDto messageDto) {
        if (messageDto.getMessageType() == MessageDto.MessageType.MANAGER) {
            System.out.println("Manager called");
        } else {
            super.callNext(messageDto);
        }
    }
}
