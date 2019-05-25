package com.example.demo.services;

import com.example.demo.models.UserReviewModelDTO;

import java.util.List;
import java.util.Optional;

public interface UserReviewService {
    List<UserReviewModelDTO> findallUser();

    String saveUserReview(UserReviewModelDTO userdata);
    String updateUserReview(UserReviewModelDTO userdata);
    String deleteUserReview(UserReviewModelDTO userdata);
    Optional<UserReviewModelDTO>searchUserReview(Integer id);

    String deleteUserReview(Integer id);
}
