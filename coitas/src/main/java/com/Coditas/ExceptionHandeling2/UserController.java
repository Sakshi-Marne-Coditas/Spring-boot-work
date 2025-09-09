package com.Coditas.ExceptionHandeling2;

import com.Coditas.Exceptionhandeling.UserNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        if (id == 0) {
            throw new UserNotFoundException("User with ID " + id + " not found");
        }
        return "User Found with ID " + id;
    }
}
