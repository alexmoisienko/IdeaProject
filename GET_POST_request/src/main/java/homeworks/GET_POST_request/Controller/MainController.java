package homeworks.GET_POST_request.Controller;

import homeworks.GET_POST_request.User;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
// аннотации стринга валид валидэйт
//
// 2 postmapping