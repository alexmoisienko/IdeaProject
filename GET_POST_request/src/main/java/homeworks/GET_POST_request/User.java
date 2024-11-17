package homeworks.GET_POST_request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonAutoDetect
public class User {
    private String login;
    private String password;
    private Date datetime;

    public String toString() {
        return "{login='" + login + "', password='" + password + "', datetime='" + datetime + "'}";
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}