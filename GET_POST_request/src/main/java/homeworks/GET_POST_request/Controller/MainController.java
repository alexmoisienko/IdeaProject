package homeworks.GET_POST_request.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import homeworks.GET_POST_request.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class MainController {
    @Autowired
    private ObjectMapper ObjectMapper;

    @GetMapping("/api/main")
    public String GET_main() {
        User user = new User("qwerty", "123456");

        return user.toString();
    }

    @PostMapping("/api/main")
    public String POST_main(@RequestBody User user) {
        user.setDatetime(new Date());
        return user.toString();

    }
}
