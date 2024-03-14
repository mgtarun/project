package com.example.demo.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.UserModel;
import com.example.demo.Services.UserService;


@RestController
// @RequestMapping("api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> SignUp(@RequestBody UserModel user) {
        return userService.signUp(user);
        
    }

    @PostMapping("/auth")
    public boolean auth(@RequestBody UserModel user) {
        return userService.authenticate(user.getUserName(), user.getPassword());
    }
    

    
}