package com.example.demo.store;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class HelloWorldStore {

    private final Map<Integer, String> greetings;

    public HelloWorldStore() {
        this(getDefaultStore());
    }

    public HelloWorldStore(Map<Integer, String> greetings) {
        this.greetings = greetings;
    }

    public void remove(int id) {
        this.greetings.remove(id);
    }

    public String get(int id) {
        return this.greetings.get(id);
    }

    public Map<Integer, String> getAll() {
        return Collections.unmodifiableMap(this.greetings);
    }

    private static Map<Integer, String> getDefaultStore() {
        final Map<Integer, String> store = new HashMap<>();

        store.put(1, "Hello World");
        store.put(2, "Привет мир");
        store.put(3, "ciao mondo");
        store.put(4, "Hallo Welt");
        store.put(5, "Bonjour le Monde");
        store.put(6, "مرحبا بالعالم");
        store.put(7, "שלום עולם");
        store.put(8, "नमस्ते दुनिया");

        return store;
    }
}
