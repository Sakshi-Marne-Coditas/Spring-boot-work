package com.AOPPractice.AOP.Controller;

import com.AOPPractice.AOP.Model.Message;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ClassController {

    @PostMapping("/add")
    public String addMessage(@RequestBody Message message) {
        System.out.println("Inside addMessage method");
        if(message.getContent().equals("error")) {
            throw new RuntimeException("Simulated Exception");
        }
        return "Message added: " + message.getContent();
    }

    @GetMapping("/get")
    public Message getMessage(@RequestParam String msg) {
        System.out.println(">>> Inside getMessage method");
        return new Message(msg);
    }
}
