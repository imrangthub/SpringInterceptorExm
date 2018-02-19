package com.imran.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.imran.model.User;

@Controller
@RequestMapping("/admin")
public class AdminController {

   @GetMapping("/")
   public String userInfo() {

      System.out.println("This message from Admin Controller.");

      return "user";
   }
   
   

}