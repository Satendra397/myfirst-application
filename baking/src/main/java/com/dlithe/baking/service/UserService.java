package com.dlithe.baking.service;


import com.dlithe.baking.dto.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    ResponseEntity<BaseResponse> findUserDetail(int userId);
}
