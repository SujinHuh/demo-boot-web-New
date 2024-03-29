package me.whiteship.demobootweb;


import org.aspectj.weaver.patterns.PerObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    /*
    perHandle 1
    perHandle 2
    요청 처리
    postHandle 2
    postHandle 1
    뷰 랜더링
    afterCompletion 2
    afterCompletion 1
     */

    @GetMapping("/hello")
    public String hello(@RequestParam("id") Person person) {
     return "hello " + person.getName();
    }

    @GetMapping("/message")
    public String message(@RequestBody String body) {
        return body;
    }

    @GetMapping("/jsonMessage")
    public Person jsonMessage(@RequestBody Person person) {
        return person;
    }
    @GetMapping("/xmlMessage")
    public Person xmlMessage(@RequestBody Person person) {
        return person;
    }
}