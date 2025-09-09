package com.AOPPractice.AOP.Controller;

import com.AOPPractice.AOP.Model.Account;
import com.AOPPractice.AOP.Service.AccountService;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AppController {
    @Autowired
    private  AccountService accountService;

    @PostMapping("/add")
    public Account addAccount(@RequestBody Account account) {
        return accountService.addAccount(account);
    }

    @GetMapping("/account")
    public List<Account> getAccount() {
        return accountService.getAccount();
    }
    @GetMapping("/check")
    public void testOrderAnnot(){
        System.out.println("inside testOrderAnnot");
    }

    @DeleteMapping("/account/{id}")
    public String deleteAccount(@PathVariable int id){
        return accountService.deleteAccount(id);
    }

    @GetMapping("/looping")
    public List<Object> getAllLooping() {
        List<Object> results = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            results.add(accountService.getAllLoop(i));
        }
        return results;
    }
}
