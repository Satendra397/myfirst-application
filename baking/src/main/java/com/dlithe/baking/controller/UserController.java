package com.dlithe.baking.controller;


import com.dlithe.baking.dto.BaseResponse;
import com.dlithe.baking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("fetch-user-detail/{userId}")
    public ResponseEntity<BaseResponse> getUserDetail(@PathVariable int userId)
    {
        if(userId==0 || String.valueOf(userId)==null)
        {
            BaseResponse baseResponse= new BaseResponse();

            baseResponse.setMessage("user id is not 0 or null");
            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());

            return new ResponseEntity<BaseResponse>(baseResponse,HttpStatus.BAD_REQUEST);
        }
        return userService.findUserDetail(userId);
    }
}
