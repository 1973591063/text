package com.zzt.springboot.conctoller;
import com.zzt.springboot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetPerson {

    @Autowired
    private Person person;

    @RequestMapping("/person")
    public Person getPerson(){
        return person;
    }
}
