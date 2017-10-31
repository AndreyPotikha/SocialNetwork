package fecebook.vertex.service.message;

import fecebook.vertex.model.User;

public class HappyBuilder extends MessageBuilder{


    @Override
    public String build(User user) {
        return "Dear "
                + user.getName()
                + " "
                + user.getSurname()
                + " "
                + "Happy birthday";
    }
}
