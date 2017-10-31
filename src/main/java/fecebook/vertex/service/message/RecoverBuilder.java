package fecebook.vertex.service.message;

import fecebook.vertex.model.User;

public class RecoverBuilder extends MessageBuilder {

    @Override
    public String build(User user) {
        return "Dear "
                + user.getName()
                + " "
                + "you recover password"
                + "\n"
                + "chek ur email for new pass";
    }
}
