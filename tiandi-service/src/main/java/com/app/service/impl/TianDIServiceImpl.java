package com.app.service.impl;

import com.app.responsedto.ServiceResponse;
import com.app.service.TianDiService;
import org.springframework.stereotype.Service;

@Service
public class TianDIServiceImpl implements TianDiService {

    @Override
    public ServiceResponse getUser() {
        try{
            User user = new User("大屁",26,1,"happytoo","happytoo");
            return new ServiceResponse(user);
        }catch (Exception e){

            return  null;
        }
    }
}
