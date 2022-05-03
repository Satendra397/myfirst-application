package com.dlithe.baking.serviceimpl;


import com.dlithe.baking.dto.BaseResponse;
import com.dlithe.baking.dto.UserDetailResponse;
import com.dlithe.baking.entity.Users;
import com.dlithe.baking.repository.UserDao;
import com.dlithe.baking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {



    @Autowired
    private UserDao userDao;

    @Override
    public ResponseEntity<BaseResponse> findUserDetail(int userId) {
        Optional<Users> users=userDao.findById(userId);
        UserDetailResponse userDetailResponse=new UserDetailResponse();
        BaseResponse baseResponse=new BaseResponse();


        if (!users.isPresent())
        {
            baseResponse.setMessage("given id not found");
            baseResponse.setHttpStatus(HttpStatus.NOT_FOUND);
            baseResponse.setHttpStatusCode(HttpStatus.NOT_FOUND.value());
            baseResponse.setResponse(userDetailResponse);


            return new ResponseEntity<BaseResponse>(baseResponse,HttpStatus.NOT_FOUND);
        }

        Users userData =users.get();
        userDetailResponse.setId(userData.getId());
        userDetailResponse.setFirstName(userData.getFirstName());
        userDetailResponse.setLastName(userData.getLastName());
        userDetailResponse.setMobileNo(userData.getMobileNo());
        baseResponse.setMessage("fetch data successfully");
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setHttpStatusCode(HttpStatus.OK.value());
        baseResponse.setResponse(userDetailResponse);


        return new ResponseEntity<BaseResponse>(baseResponse,HttpStatus.OK);
    }

}

