package ru.valaubr.behavioral.chainofresponsibility;

import ru.valaubr.behavioral.chainofresponsibility.chains.Handler;
import ru.valaubr.behavioral.chainofresponsibility.chains.HrHandler;
import ru.valaubr.behavioral.chainofresponsibility.chains.ManagerHandler;
import ru.valaubr.behavioral.chainofresponsibility.chains.TechSupHandler;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Handler chain = new ManagerHandler(
                new HrHandler(
                        new TechSupHandler(
                                null)));
        List<MessageDto> messages = List.of(
                new MessageDto(MessageDto.MessageType.HR, "Message"),
                new MessageDto(MessageDto.MessageType.MANAGER, "Message"),
                new MessageDto(MessageDto.MessageType.TECH_SUP, "Message"),
                new MessageDto(MessageDto.MessageType.DIRECTOR, "Message"),
                new MessageDto(MessageDto.MessageType.MANAGER, "Message")
        );

        messages.forEach(chain::handleRequest);
    }
}
