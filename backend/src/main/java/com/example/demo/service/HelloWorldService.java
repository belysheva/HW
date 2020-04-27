package com.example.demo.service;

import com.example.demo.store.HelloWorldStore;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class HelloWorldService {

    private final HelloWorldStore store;

    public HelloWorldService(HelloWorldStore store) {
        this.store = store;
    }

    public void remove(Integer id) {
        if (id != null) {
            store.remove(id);
        } else
            throw new NullPointerException();
    }

    public String get(Integer id) {
        if (id != null) {
          return store.get(id);
        } else
            throw new NullPointerException();
    }

    public Map<Integer, String> getAll() {
        return store.getAll();
    }
}
