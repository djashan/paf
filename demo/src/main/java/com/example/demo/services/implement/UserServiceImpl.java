package com.example.demo.services.implement;
import com.example.demo.models.UserReviewModelDTO;
import com.example.demo.repositories.UserReviewRepository;
import com.example.demo.services.UserReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserReviewService {

    @Autowired
    private UserReviewRepository userReviewRepository;

    @Override
    public List<UserReviewModelDTO> findallUser() {

     List<UserReviewModelDTO> allusers = userReviewRepository.findAll();
     return allusers;
    }

    @Override
    public String saveUserReview(UserReviewModelDTO userdata) {
        userReviewRepository.save(userdata);
        return "Data saved";
    }

    @Override
    public String updateUserReview(UserReviewModelDTO userdata) {
        String msg = null;

        if(userdata.getId() != null){
            userReviewRepository.save(userdata);
            msg = "User Updated";
        }
        else{
            msg = "can't update User";
        }
        return msg;
    }

    @Override
    public String deleteUserReview(UserReviewModelDTO userdata) {
        return null;
    }

    @Override
    public Optional<UserReviewModelDTO> searchUserReview(Integer id) {
        return userReviewRepository.findById(id);
    }

    @Override
    public String deleteUserReview(Integer id) {
        userReviewRepository.deleteById(id);
        return "user deleted";
    }




}
