package com.imran.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.imran.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	  @GetMapping("/")
	   public String dashboard() {

	      System.out.println("This message from User Controller user Dashboard Action.");

	      return "user";
	   }
	  
   @GetMapping("/info")
   public String userInfo() {

      System.out.println("This message from User Controller user info Action.");

      return "user";
   }
   
   

}