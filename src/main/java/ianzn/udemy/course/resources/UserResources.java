package ianzn.udemy.course.resources;

import ianzn.udemy.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Ian", "ian@gmail.com", "080404");
        return ResponseEntity.ok().body(u);
    }
}
