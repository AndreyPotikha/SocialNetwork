package fecebook.vertex.service;

import fecebook.vertex.model.User;
import fecebook.vertex.service.message.HappyBuilder;
import fecebook.vertex.service.message.HappyChack;
import fecebook.vertex.service.message.MessageBuilder;
import fecebook.vertex.service.message.RecoverBuilder;

public class MessageService {

    public static void main(String[] args) {

        final User user = new User();
        user.setName("Alex");
        user.setSurname("Smirnov");
        MessageBuilder builder = new HappyBuilder();

        final String message = builder.build(user);
        System.out.println(message);
    }
}
