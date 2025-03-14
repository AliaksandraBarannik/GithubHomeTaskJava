package models;

import config.EnvConfig;
import lombok.Getter;
import lombok.Setter;

import static lombok.AccessLevel.PUBLIC;

public class UserFactory {
    @Getter(PUBLIC)
    @Setter(PUBLIC)
    private User user;

    public UserFactory() {
        this.user = User.builder()
            .userName(EnvConfig.getUserName())
            .password(EnvConfig.getPassword())
            .build();
    }
}
