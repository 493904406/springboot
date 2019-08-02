package com.app.service.impl;

import com.app.entity.User;
import com.app.mapper.UserMapper;
import com.app.responsedto.ServiceResponse;
import com.app.service.TianDiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TianDIServiceImpl implements TianDiService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ServiceResponse getUser() {
        try{
            User user = userMapper.selectByPrimaryKey(1L);
            return new ServiceResponse(user);
        }catch (Exception e){

            return  null;
        }
    }
}
