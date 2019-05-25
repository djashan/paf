package com.example.demo.controllers;

import com.example.demo.models.UserReviewModelDTO;
import com.example.demo.services.UserReviewService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserR {
    @Autowired
    private UserReviewService userreviewservice;

    @GetMapping("/all")
    public List<UserReviewModelDTO> allUsers(){
       return userreviewservice.findallUser();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserReviewModelDTO Userdata){


        @PostMapping("/update")
        public String updateUser(@RequestBody UserReviewModelDTO User){
            return userreviewservice.updateUserReview(Userdata);
        }

        @GetMapping("/find/{id}")
        public Optional<UserReviewModelDTO> searchUser(@PathVariable Integer id){
            return userreviewservice.searchUserReview(id);
        }

        @DeleteMapping("/delete/{id}")
        public String deleteUser(@PathVariable Integer id){
            return userreviewservice.deleteUserReview(id);
        }


       return userreviewservice.saveUserReview(Userdata);
    }

}
