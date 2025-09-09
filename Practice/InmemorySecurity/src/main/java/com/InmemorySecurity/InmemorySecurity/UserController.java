package com.InmemorySecurity.InmemorySecurity;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usersadd")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

}

