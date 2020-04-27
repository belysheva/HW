package com.example.demo.controller;

import com.example.demo.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("greeting")
//@RequiredArgsConstructor
public class GreetingController {
    private final HelloWorldService helloWorldService;

    public GreetingController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
    public Map<Integer, String> list() {
        return helloWorldService.getAll();
    }

    @GetMapping("{id}")
    public String getOne(@PathVariable("id") Integer id) {
        return this.helloWorldService.get(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id) {
        helloWorldService.get(id);
    }
}
