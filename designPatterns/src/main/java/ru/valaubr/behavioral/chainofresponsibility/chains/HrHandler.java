package ru.valaubr.behavioral.chainofresponsibility.chains;

import ru.valaubr.behavioral.chainofresponsibility.MessageDto;

public class HrHandler extends Handler {

    public HrHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(MessageDto messageDto) {
        if (messageDto.getMessageType() == MessageDto.MessageType.HR) {
            System.out.println("HrHandler called");
        } else {
            super.callNext(messageDto);
        }
    }
}
