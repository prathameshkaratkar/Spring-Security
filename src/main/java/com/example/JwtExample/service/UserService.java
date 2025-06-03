package com.example.JwtExample.service;

import com.example.JwtExample.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Prathamesh Karatkar","karatkarprathamesh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Tushar Sarade","tusharsarade@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Girish Ashtul","girishashtul@gmail.com"));

    }

    public List<User> getUsers() {
        return this.store;
    }
}
