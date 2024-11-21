package homeworks.GET_POST_request.Controller;

import homeworks.GET_POST_request.User;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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

        return new ResponseEntity<>(user1, HttpStatus.CREATED);

    }

    @PostMapping("/api/main/map")
    public ResponseEntity<?> POST_main_map(@RequestBody Map<String, @NotEmpty String> map) {

        Object login = map.get("login");
        Object password = map.get("password");

        if (login != null && password != null) {
            User user = new User(login.toString(), password.toString());
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}
// аннотации стринга валид валидэйт
//
// 2 postmapping