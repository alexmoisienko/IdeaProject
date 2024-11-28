package Home.G_P;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User {
    @NotNull
    @NotEmpty
    private String login;
    @NotNull
    @NotEmpty
    private String password;
    private Date datetime;

    public String toString() {
            return "{login='" + login + "', password='" + password + "', datetime='" + datetime + "'}";
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.datetime = new Date();
    }
}