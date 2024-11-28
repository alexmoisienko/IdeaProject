package Home.G_P.Controller;

import Home.G_P.User;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class MainController {

    @GetMapping("/api/main")
    public ResponseEntity<User> GET_main() {

        User user = new User("qwerty", "123456");

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/api/main")
    public ResponseEntity<User> POST_main(@Valid @RequestBody User user) {

        User user1 = new User(user.getLogin(), user.getPassword());

        return new ResponseEntity<>(user1, HttpStatus.OK);

    }

    @PostMapping("/api/main/map")
    public ResponseEntity<?> POST_main_map(@RequestBody Map<String, @NotEmpty String> map) {

        User user = new User(map.get("login"), map.get("password"));

        if (user.getLogin() != null && user.getPassword() != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}