package fecebook.vertex.service.message;

import fecebook.vertex.model.User;

public class HappyChack extends MessageBuilder {

    @Override
    public String build(User user) {
        return "Dear "
                + user.getName()
                + " "
                + user.getSurname()
                + " "
                + "Successful registration";
    }
}
