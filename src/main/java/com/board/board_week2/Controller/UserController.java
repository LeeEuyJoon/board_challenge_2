package com.board.board_week2.Controller;

import com.board.board_week2.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login() {


        return "login";
    }

}
