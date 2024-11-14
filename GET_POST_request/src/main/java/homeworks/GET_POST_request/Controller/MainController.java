package homeworks.GET_POST_request.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import homeworks.GET_POST_request.JSON_dynamic;
import homeworks.GET_POST_request.JSON_static;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MainController {
    @Autowired
    private ObjectMapper ObjectMapper;

    @GetMapping("/api/main")
    public String giveJSON_static() {
        JSON_static new_get_object = new JSON_static("Hello World!");
        String jsonGETData = null;
        try {
            jsonGETData = ObjectMapper.writeValueAsString(new_get_object);
        } catch (JsonProcessingException e) {
            System.out.println("Error");
        }

        return jsonGETData;
    }

    @PostMapping("/api/main")
    public String giveJSON_dynamic(@RequestParam String login, @RequestParam String password)
    {
        JSON_dynamic new_post_object = new JSON_dynamic(login, password, new Date());
        String jsonPOSTData = null;
        try {
            jsonPOSTData = ObjectMapper.writeValueAsString(new_post_object);
        } catch (JsonProcessingException e) {
            System.out.println("Error");
        }

        return jsonPOSTData;
    }
}
