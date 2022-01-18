package com.example.springprojectblogwk9task.controller;

import com.example.springprojectblogwk9task.entity.Users;
import com.example.springprojectblogwk9task.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Controller
public class UserController {

private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("login")
    public ResponseEntity<String> LogIn(@RequestBody Users users) {

        if(userService.logInUser(users) == null){
            return new ResponseEntity<>("wrong password", HttpStatus.NOT_FOUND);
        }


      return new ResponseEntity<>("Login was successful", HttpStatus.ACCEPTED);
    }



    @PostMapping("/registerUser")
    public ResponseEntity<String> RegisterUser(@RequestBody Users users){
        userService.addUser(users);
        return new ResponseEntity<>("User was successfully  created.", HttpStatus.CREATED);
    }

    @PutMapping("updateUser")
    public String UpdateDetails(){
       return "update details";
    }

    @DeleteMapping("deleteUser")
    public String DeleteAccount(){
        return  "account deleted";
    }


}
