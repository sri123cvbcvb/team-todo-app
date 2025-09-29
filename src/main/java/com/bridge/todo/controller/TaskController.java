package com.bridge.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping
    public void welcome(){
        System.out.println("Welcome to TaskController");
    }
}
