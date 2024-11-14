package homeworks.GET_POST_request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JSON_dynamic {
    private String login;
    private String password;
    private Date datetime;
}
