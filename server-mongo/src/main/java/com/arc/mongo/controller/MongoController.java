package com.arc.mongo.controller;

import com.arc.mongo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "mongo")
public class MongoController {

    @Autowired
    private PersonService personService;


    //test
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Object test() {
        return null;
    }
}
