package com.app.controller;

import com.app.responsedto.ResponseEntity;
import com.app.responsedto.ResponseEntityFactory;
import com.app.responsedto.ServiceResponse;
import com.app.service.TianDiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private TianDiService tianDiService;

    @GetMapping("/hello")
    public ResponseEntity hello(){
        ServiceResponse response = tianDiService.getUser();
        return ResponseEntityFactory.build(response);
    }
}
