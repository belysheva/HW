package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("message")
public class MessageController {
    private List<String> greetings = Arrays.asList(
                    "Hello World",
                    "Привет мир",
                    "ciao mondo",
                    "Hallo Welt",
                    "Bonjour le Monde",
                    "مرحبا بالعالم",
                    "שלום עולם",
                    "नमस्ते दुनिया"
            );


    @GetMapping
    public List<String> list() {
        return greetings;
    }

//    @GetMapping("{id}")
//    public Message getOne(Message message) {
//        return message;
//    }
//
//    @PostMapping
//    public Message create(@RequestBody Message message) {
//
//        return messageRepo.save(message);
//    }
//
//    @PutMapping("{id}")
//    public Message update(
//            @PathVariable("id") Message messageFromDb,
//            @RequestBody Message message
//    ) {
//        BeanUtils.copyProperties(message, messageFromDb, "id");
//
//        return messageRepo.save(messageFromDb);
//    }
//
//    @DeleteMapping("{id}")
//    public void delete(@PathVariable("id") Message message) {
//        messageRepo.delete(message);
//    }
}
