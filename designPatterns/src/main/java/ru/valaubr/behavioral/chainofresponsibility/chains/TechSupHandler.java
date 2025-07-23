package ru.valaubr.behavioral.chainofresponsibility.chains;

import ru.valaubr.behavioral.chainofresponsibility.MessageDto;

public class TechSupHandler extends Handler {

    public TechSupHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(MessageDto messageDto) {
        if (messageDto.getMessageType() == MessageDto.MessageType.TECH_SUP) {
            System.out.println("TechSup called");
        } else {
            super.callNext(messageDto);
        }
    }
}
